
class Solution {
    public boolean isAnagram(String s, String t) {
       
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);

        }
        for (int i = 0; i < t.length(); i++) {
            
            if (!map.containsKey(t.charAt(i))) {
                return false;
            } else if (map.get(t.charAt(i)) == 1) {
                map.remove(t.charAt(i));
            } else {
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
            }
        }
        if (map.size() == 0) {
            return true;
        }
        return false;
    }
}
//Optimal Solution using array 
class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length())
            return false;
      
        int[] counts = new int[26];
        
        for(int i=0;i<s.length();i++){
            counts[s.charAt(i)-'a']++;
            counts[t.charAt(i)-'a']--;
        }
        
        for(int count : counts){
            if(count!=0)
                return false;
        }
        
        return true;
    }
}
