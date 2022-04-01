class Solution {
    public int minSwaps(String s) {
        Stack<Character> st = new Stack<>();
        int mismatch = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '[')
                st.push(c);
            else if (!st.isEmpty())
                st.pop();
            else
                mismatch++;
        }
        return (mismatch + 1) / 2;
    }
}

class Solution {
    public int minSwaps(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '[')
                count++;
            else if (count > 0)
                count--;
        }
        return (count + 1) / 2;
    }
}
