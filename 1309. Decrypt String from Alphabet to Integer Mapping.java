class Solution {
    public String freqAlphabets(String s) {

        int n = s.length();
        String ans="";
        for (int i = 0; i < n;) {
            if (i < n - 2 && s.charAt(i+2) == '#') {
                int x=Integer.parseInt(s.substring(i, i+2));
                ans+=(char)(x+96);
                i+=3;
                continue;
            }
            ans+=(char)(97+s.charAt(i)-'1');
            i++;
        }
        return ans;

    }
}
