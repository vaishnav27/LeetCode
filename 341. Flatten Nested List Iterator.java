
public class NestedIterator implements Iterator<Integer> {
    List<Integer> flattenedList = null;
    int count = 0;

    public NestedIterator(List<NestedInteger> nestedList) {
        flattenedList = new ArrayList<>();
        for (NestedInteger nestedInteger : nestedList) {
            flatten(nestedInteger);
        }

    }

    private void flatten(NestedInteger val) {
        if (val.isInteger()) {
            flattenedList.add(val.getInteger());
        } else {
            for (NestedInteger integer : val.getList()) {
                flatten(integer);
            }
        }
    }

    @Override
    public Integer next() {
        return flattenedList.get(count++);
    }

    @Override
    public boolean hasNext() {
        return count < flattenedList.size();
    }
}
