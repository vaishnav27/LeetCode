
class OrderedStream {
    private String[] arr;
    private int currentptr;

    public OrderedStream(int n) {
        this.arr = new String[n];
        this.currentptr = 0;
    }

    public List<String> insert(int idKey, String value) {

        arr[idKey - 1] = value;
        List<String> result = new ArrayList<>();
        for (int i = currentptr; i < arr.length; i++) {
            if (arr[i] == null) {
                break;
            }
            result.add(arr[i]);
            currentptr++;
        }
        return result;
    }
}
