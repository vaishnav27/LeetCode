class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        int n=numbers.size();
        vector<int>res;
        int left=0,right=n-1;
        while(left<right){
            if(numbers[left]+numbers[right]==target){
                res={left+1,right+1};
                return res;
                
            }else if(numbers[left]+numbers[right]>target){
                right--;
            }else left++;
        }
        return res;
    }
               
};
