class Solution {
    public int minimumSum(int num) {
        
        int[] ans= new int[4];
        int c=0;
        
        while(num>0){
            int rem=num%10;
            num/=10;
            ans[c++]=rem;
        }
        
        Arrays.sort(ans);
        
        int num1=ans[0]*10+ans[2];
        int num2=ans[1]*10+ans[3];
       
        return num1+num2;
        
        
    }
}
