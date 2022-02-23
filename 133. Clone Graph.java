
class Solution {
    public Node cloneGraph(Node node) {
        if (node == null)
            return null;

        Map<Node, Node> map = new HashMap<>();
        Queue<Node> q = new ArrayDeque<>();

        q.add(node);

        map.put(node, new Node(node.val, new ArrayList<>()));

        while (!q.isEmpty()) {
            Node x = q.poll();

            for (Node neighbor : x.neighbors) {
                if (!map.containsKey(neighbor)) {
                    map.put(neighbor, new Node(neighbor.val, new ArrayList<>()));
                    q.add(neighbor);
                }
                map.get(x).neighbors.add(map.get(neighbor));
            }
        }
        return map.get(node);
    }
}
