class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 
        int[] ans = new int[nums1.length];
        Arrays.fill(ans, -1); 
        int len1 = nums1.length; 
        int len2 = nums2.length; 
        
        for (int i = 0; i < len2; i++) { 
            map.put(nums2[i], i); 
        }
        
        for (int i = 0; i < len1; i++) { 
            int currNum = nums1[i]; 
            for (int j = map.get(currNum) + 1; j < len2; j++) { 
                if (nums2[j] > currNum) { 
                    ans[i] = nums2[j]; 
                    break; 
                }
            }
        }
        
        return ans; 
        
    }
}
