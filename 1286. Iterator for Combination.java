class CombinationIterator {

    PriorityQueue<String> pq = new PriorityQueue<>();

    public CombinationIterator(String characters, int combinationLength) {
        generatreCom(characters, combinationLength, 0, new StringBuilder());
    }

    public String next() {
        if (hasNext()) {
            return pq.poll();
        } else {
            return null;
        }
    }

    public boolean hasNext() {
        return pq.size() > 0;
    }

    public void generatreCom(String s, int len, int start, StringBuilder currStr) {
        if (len == 0) {
            pq.add(currStr.toString());
            return;
        }

        for (int i = start; i <= s.length() - len; i++) {
            currStr.append(s.charAt(i));
            generatreCom(s, len - 1, i + 1, currStr);
            currStr.deleteCharAt(currStr.length() - 1);
        }
    }
}
