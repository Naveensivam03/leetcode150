

  public class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode() {}
  TreeNode(int val) { this.val = val; }
  TreeNode(int val, TreeNode left, TreeNode right) {
  this.val = val;
  this.left = left;
  this.right = right;
  }
  }
  class Solution {
    private int res  = Integer.MAX_VALUE; 
    private Integer prev  = null;
    public int getMinimumDifference(TreeNode root) {
        
       inorder(root);
       return res;
             }
    private void  inorder(TreeNode node){

            if(node ==null ){
                return ;
            }
            inorder(node.left);
            if(prev != null){
                res = Math.min(res , node.val - prev);
            }
            prev = node.val;
            inorder(node.right);
        }

}

public class main{
public static void  main(String[] args){
    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(2);
    root.left.left = new TreeNode(1);
    root.left.right = new TreeNode(3);
    root.right = new TreeNode(6);
    root.right.left = new TreeNode(5);
    Solution sol = new Solution();
    int res = sol.getMinimumDifference(root);
    System.out.println("minimum subtree is " + res);
}}
