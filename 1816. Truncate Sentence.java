class Solution {
  public String truncateSentence(String s, int k) {

    String[] str = s.split(" ");

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < k-1; i++) {
      sb.append(str[i] + " ");
    }
    sb.append(str[k - 1]);

    return sb.toString();
  }
      
      
}

// ANOTHER SOLUTION

class Solution {
  public String truncateSentence(String s, int k) {
    int idx = 0;
    int spacecount = 0;

    while (idx < s.length() && spacecount < k) {
      if (s.charAt(idx) == ' ')
        spacecount++;

      idx++;
    }
    if(spacecount!=k)
      return s;
    else 
      return s.substring(0, idx - 1);
  }
}
