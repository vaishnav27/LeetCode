class Solution {
    class Point {
        TreeNode root;
        int x, y;

        Point(TreeNode root, int x, int y) {
            this.root = root;
            this.x = x;
            this.y = y;
        }
    }

    int minInd = Integer.MAX_VALUE;
    int maxInd = Integer.MIN_VALUE;

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null)
            return ans;
        Map<Integer, PriorityQueue<Point>> map = new HashMap<>();
        Queue<Point> q = new LinkedList<>();
        q.offer(new Point(root, 0, 0));
        Comparator<Point>comparator=(a,b)->{
            if(a.y==b.y){
                return a.root.val-b.root.val;
            }else{
                return a.y-b.y;
            }
        };
        
        while (!q.isEmpty()) {
            Point point = q.poll();
            root = point.root;
            map.putIfAbsent(point.x, new PriorityQueue<>(comparator));
            map.get(point.x).add(point);
            minInd = Math.min(minInd, point.x);
            maxInd = Math.max(maxInd, point.x);
            if (root.left != null)
                q.offer(new Point(root.left, point.x - 1, point.y + 1));
            if (root.right != null)
                q.offer(new Point(root.right, point.x + 1, point.y + 1));
        }
        for (int i = minInd; i <=maxInd; i++) {
            PriorityQueue<Point> pq = map.get(i);
            List<Integer> list = new ArrayList<>();
            while (!pq.isEmpty()) {
                list.add(pq.poll().root.val);
            }
            ans.add(list);
        }
        return ans;
    }
}
