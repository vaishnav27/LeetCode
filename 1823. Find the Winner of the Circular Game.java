class Solution {
    public int findTheWinner(int n, int k) {
       int res=0;
        
        for(int i=1;i<=n;i++){
            res=(res+k)%i;
        }
        return res+1;
    }
}

// Using Josephus Algorithm
class Solution {
    public int findTheWinner(int n, int k) {
        if (n == 1)
            return 1;

        return (findTheWinner(n-1,k)+k-1)%n+1;

    }
}
