class RandomizedSet {
    HashMap<Integer, Integer> map;
    List<Integer> list;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (map.containsKey(val))
            return false;
        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val))
            return false;
        int ind = map.get(val);
        Collections.swap(list, ind, list.size() - 1);
        int swapped = list.get(ind);
        map.put(swapped, ind);
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        Random r = new Random();
        int x = r.nextInt(list.size());
        return list.get(x);
    }
}
