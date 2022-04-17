class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long ans =0;
            ans+=(total / cost2) + 1;

        while (total > 0) {
            total -= cost1;
            if (total < 0)
                break;
            if (total == 0) {
                ans++;
                break;
            }
            ans += total / cost2 + 1;
        }
        return ans;
        
        // RECURSIVE
        // if(total<0)return 0;
        // else
        //     return (1+total/cost2)+(waysToBuyPensPencils(total-cost1,cost1,cost2));

    }
}
