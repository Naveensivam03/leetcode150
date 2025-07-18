class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

class Solution {
    public Node connect(Node root) {
    Queue<Node> q = new LinkedList<>();
    int level = 0;
    root.next = null;
    q.offer(root);
    while(!q.isEmpty()){
      int lev = q.size();
      Node prev = null;
      for(int i =0; i<lev;i++){
       Node curr = q.poll();
        if(prev!=null){
          prev.next = curr
        }
        prev= curr;
        if(curr.left!=null)q.offer(curr.left);
        if(curr.right!=null)q.offer(curr.right);
      }
      prev.next = null;
    }
    return root;
    }
}
