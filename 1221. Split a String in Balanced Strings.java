class Solution {
    public int balancedStringSplit(String s) {
        int count = 0, res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L')
                count+=1;
            else
                count += -1;

            if (count == 0)
                res++;

        }
        return res;
    }
}
