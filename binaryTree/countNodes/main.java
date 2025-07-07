//1<<num = 2^num;  its because it just left shift that alone;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int countNodes(TreeNode root) {
        if(root ==null)return 0;

        //if the left and right side is equal then it is a perfect tree
        if(heightLeft(root)==heightRight(root)){
            return ((1<<heightLeft(root)) -1);
        }
        else{
            return 1+ countNodes(root.left)+countNodes(root.right);
        }
    }

    public Integer heightLeft(TreeNode root){
        int count = 0;
        while(root !=null){
            count ++;
            root  = root.left;
            
        }
        return count;
    }
    public Integer heightRight(TreeNode root){
        int  count = 0;
        while(root !=null){
            count ++;
            root  = root.right;
            
        }
        return count;
    }

}
