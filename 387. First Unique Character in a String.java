class Solution {
    public int firstUniqChar(String s) {
      
         HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {

            if (!map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), i);
            else
                map.put(s.charAt(i), -1);
        }
        
        int min = Integer.MAX_VALUE;
        
        for (char key : map.keySet()) {
            if (map.get(key) > -1 && map.get(key) < min) 
                min = map.get(key);
        }
        
        if (min == Integer.MAX_VALUE) 
            return -1;
        
        return min;
    }
}
