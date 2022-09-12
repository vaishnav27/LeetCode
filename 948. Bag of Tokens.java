class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        if(tokens.length==1 && power<tokens[0]){
            return 0;
        }
        Arrays.sort(tokens);
        int i=0,j=tokens.length-1,point=0,ans=0;
        
        while(i<=j){
            if(power>=tokens[i]){
                power-=tokens[i];
                i++;
                point++;
                ans=Math.max(ans,point);
            }else if(point>0){
                power+=tokens[j];
                j--;
                point--;
            }else{
                break;
            }
        }
        return ans;
    }
}
