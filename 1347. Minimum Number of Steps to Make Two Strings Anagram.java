class Solution {
    public int minSteps(String s, String t) {
        int[] freq = new int[26];
     

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        int ans = 0;
        for (int i = 0; i < freq.length; i++) {
            System.out.print(freq[i]+" ");
            if(freq[i]>0){
                ans+=freq[i];
            }
        }
        return ans;

    }
}
