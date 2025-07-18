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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
            return helper(0 , inorder.length-1 ,preorder.length-1, inorder , postorder);
    }

    public TreeNode helper(int start , int end , int posStart , int[]inorder , int[] postorder){
            if(Start > end)return null;
            TreeNode root = new TreeNode(postorder[posStart]);
            int index = 0;
            for(int i =start ; i <= end;i++){
                if(inorder[i] == root.val){
                    index = i;
                }
            }

            root.right = helper(index+1 , end , posStart-1,inorder , postorder);
            root.left = helper(start , index -1 , postStart-index+start-1,inorder, postorder);
            return root;
    }
}
