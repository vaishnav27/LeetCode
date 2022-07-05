class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> com = new ArrayList<>();

        generateAll(0, new char[2 * n], com);
        return com;
    }

    public void generateAll(int ind, char[] curr, List<String> com) {
        if (ind == curr.length) {
            if (valid(curr)) {
                com.add(new String(curr));
            }
        } else {
            curr[ind] = '(';
            generateAll(ind + 1, curr, com);
            curr[ind] = ')';
            generateAll(ind + 1, curr, com);
        }
    }

    public boolean valid(char[] curr) {
        int count = 0;

        for (int i = 0; i < curr.length; i++) {
            if (curr[i] == '(')
                count++;
            else
                count--;
            
            if (count < 0) return false;

        }
        return count == 0;
    }
}

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        backTrack(0, 0, sb, res, n);
        return res;
    }

    public void backTrack(int open, int close, StringBuilder curr, List<String> res, int max) {
        if (curr.length() == max * 2) {
            res.add(curr.toString());
            return;
        }
        if (open < max) {
            curr.append('(');
            backTrack(open + 1, close, curr, res, max);
            curr.deleteCharAt(curr.length() - 1);
        } 
        if (close < open) {
            curr.append(')');
            backTrack(open, close + 1, curr, res, max);
            curr.deleteCharAt(curr.length() - 1);
        }
    }

}
