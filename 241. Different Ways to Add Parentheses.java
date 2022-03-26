
class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '*') {
                List<Integer> p1 = diffWaysToCompute(expression.substring(0, i));
                List<Integer> p2 = diffWaysToCompute(expression.substring(i + 1));

                for (Integer x1 : p1) {
                    for (Integer x2 : p2) {
                        if (expression.charAt(i) == '+') {
                            res.add(x1 + x2);
                        } else if (expression.charAt(i) == '-') {
                            res.add(x1 - x2);
                        } else {
                            res.add(x1 * x2);
                        }
                    }
                }

            }
        }
        if (res.size() == 0) {
            res.add(Integer.valueOf(expression));
        }
        return res;
    }
}
