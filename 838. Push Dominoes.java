class Solution {
    public String pushDominoes(String dominoes) {
        char[] leftFall = new char[dominoes.length()];
        for (int i = 0; i < leftFall.length; i++) {
            leftFall[i] = 'c';
        }
        boolean flag = false;
        if (dominoes.charAt(dominoes.length() - 1) == '.' || dominoes.charAt(dominoes.length() - 1) == 'R')
            leftFall[dominoes.length() - 1] = 'x';
        else{
            leftFall[dominoes.length() - 1] = 'L';
            flag=true;
        }

        for (int i = dominoes.length() - 2; i >= 0; i--) {
            if ((dominoes.charAt(i) == 'L') && (dominoes.charAt(i) != 'R')) {
                leftFall[i] = 'L';
                flag = true;
            } else if ((dominoes.charAt(i) == '.' && flag == true) && leftFall[i + 1] != 'x') {
                leftFall[i] = 'L';
            } else if ((dominoes.charAt(i) == '.' && leftFall[i + 1] == 'x') || (dominoes.charAt(i) == 'R')) {
                leftFall[i] = 'x';
            }
        }

        char[] rightFall = new char[dominoes.length()];

        flag = false;
        if (dominoes.charAt(0) == '.' || dominoes.charAt(0) == 'L') {
            rightFall[0] = 'x';
        } else {
            rightFall[0] = 'R';
            flag=true;
        }
        
        for (int i = 1; i < rightFall.length; i++) {
           
            if (dominoes.charAt(i) == 'R' && (dominoes.charAt(i) != 'L')) {
             
                rightFall[i] = 'R';
                flag = true;
            } else if ((dominoes.charAt(i) == '.' && flag == true) && rightFall[i - 1] != 'x') {
                
                rightFall[i] = 'R';
            } else if ((dominoes.charAt(i) == '.' && rightFall[i - 1] == 'x') || (dominoes.charAt(i) == 'L')) {
                rightFall[i] = 'x';
            }
        }

        // for (int i = 0; i < rightFall.length; i++) {
        //     System.out.println(rightFall[i] + " " + leftFall[i]);
        // }
        int[] rightCount = new int[dominoes.length()];
        int count = 0;
        flag = false;
        for (int i = 0; i < rightCount.length; i++) {
            if (dominoes.charAt(i) == 'R') {
                count = i;
                flag = true;
            }
            if (dominoes.charAt(i) == '.' && flag == true) {
                rightCount[i] = i - count;
            }
        }
        int[] leftCount = new int[dominoes.length()];

        count = 0;
        flag = false;
        for (int i = dominoes.length() - 1; i >= 0; i--) {
            if (dominoes.charAt(i) == 'L') {
                count = i;
                flag = true;
            }
            if (dominoes.charAt(i) == '.' && flag == true) {
                leftCount[i] = count - i;
            }
        }
        // for (int i = 0; i < leftCount.length; i++) {
        // System.out.println(leftCount[i] + " " + rightCount[i]);
        // }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < dominoes.length(); i++) {
            if (leftFall[i] == 'x' && rightFall[i] == 'x') {
                sb.append('.');
            } else if (leftFall[i] == 'L' && rightFall[i] == 'x') {
                sb.append('L');
            } else if (rightFall[i] == 'R' && leftFall[i] == 'x') {
                sb.append('R');
            } else {
                if (leftCount[i] < rightCount[i]) {
                    sb.append('L');
                } else if (leftCount[i] > rightCount[i]) {
                    sb.append('R');
                } else if (leftCount[i] == rightCount[i]) {
                    sb.append('.');
                }
            }
        }
        return sb.toString();
    }
}
