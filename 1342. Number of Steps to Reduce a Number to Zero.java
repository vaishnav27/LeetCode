class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        boolean flag = true;
        if(num==0)return 0;
        while (flag) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            count++;
            if (num == 0) {
                flag = false;
            }
        }
        return count;
    }
}
