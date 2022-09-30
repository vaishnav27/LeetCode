class Solution {
    public class Pair{
        int x,height;
        Pair(int x,int height){
            this.x = x;
            this.height = height;
        }
    }
    class SortbyPoints implements Comparator<Pair>{
        public int compare(Pair a, Pair b){
            if(a.x == b.x) return a.height - b.height;
            return a.x-b.x;
        }
    } 
    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> res = new ArrayList<>();
        List<Pair> list = new ArrayList<>();
        for(int[] arr:buildings){
            list.add(new Pair(arr[0],-arr[2]));
            list.add(new Pair(arr[1],arr[2]));
        }
        Collections.sort(list,new SortbyPoints());
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        int cur = 0;
        q.add(cur);
        for(int i=0;i<list.size();i++){
            int pos = list.get(i).x,h = list.get(i).height;
            if(h < 0) q.add(-h);
            else q.remove(h);
            
            if(cur != q.peek()){
                res.add(Arrays.asList(pos,q.peek()));
                cur = q.peek();
            }
        }
        return res;
    }
}
