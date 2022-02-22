class Solution {
    public int titleToNumber(String columnTitle) {

        if (columnTitle==null) {
            return -1;
        }
        int sum = 0;


        for (char ch : columnTitle.toUpperCase().toCharArray()) {
            sum *= 26;

            sum += ch - 'A' + 1;
        }
        return sum;
        

    }
}
