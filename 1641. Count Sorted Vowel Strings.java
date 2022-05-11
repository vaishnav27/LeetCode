class Solution {
    char[] ch=new char[]{'a','e','i','o','u'};
    public int countVowelStrings(int n) {
       
        int ans=0;
        for(char c:ch){
            ans+=fun(n-1,c);
        }
        return ans;
    }
    public int fun(int len,char last_char){
        if(len==0){
            return 1;
        }
        int temp=0;
        
        for(char c:ch){
            if(last_char>=c){
                temp+=fun(len-1,c);
            }
        }
        return temp;
    }
}
