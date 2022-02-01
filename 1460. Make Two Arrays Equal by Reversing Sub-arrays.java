// Using Collections.sort

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
      Arrays.sort(arr);
    Arrays.sort(target);

      for (int i = 0; i < target.length; i++) {
          if (target[i] != arr[i]) {
              return false;
          }
      }
      return true;
    }
}

// Using hashMap

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        if (target.length != arr.length)
            return false;

        for (int i = 0; i < target.length; i++) {
            map.put(target[i], map.getOrDefault(target[i], 0) + 1);
            map.put(arr[i], map.getOrDefault(arr[i], 0) - 1);
        }

        for (int i : map.keySet()) {
            if (map.get(i) != 0)
                return false;
        }
        return true;

    }
}
// Using count freq 

class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {

        int[] count = new int[1001];

        for (int i = 0; i < target.length; i++) {
            count[target[i]]++;
            count[arr[i]]--;
        }

        for (int i : count) {
            if (i != 0)
                return false;
        }
        return true;

    }
}
