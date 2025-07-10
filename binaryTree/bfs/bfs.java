
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
class TreeNode{
	int val ;
	TreeNode left , right;

	TreeNode(int val ){
		this.val = val;
	}
}

//to actually do the tree i mean implementing data

public class bfs{
	public static void main(String[] args){

	TreeNode root = new TreeNode(1);

	root.left = new TreeNode(2);
	root.right = new TreeNode(4);
	System.out.println("binary Tree is created!");
	inorder(root);
	System.out.println(bfst(root));	
	}
	public static void inorder(TreeNode root){
		if(root ==null) return ;
		inorder(root.left);
		System.out.println(root.val);
		inorder(root.right);

}/**
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
    public List<Double> averageOfLevels(TreeNode root) {
        
    }
}
	public static List bfst(TreeNode root){
		if (root == null) return new ArrayList<>();

		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		List<Integer> res = new ArrayList<>();
        while(!q.isEmpty()){
            int currLevel = q.size();
            for(int i =0; i < currLevel; i++){
                TreeNode current = q.poll();
                if (i == currLevel-1){

                    res.add(current.val);

                }
			if(current.left != null){
				q.offer(current.left);
			}
			if (current.right!=null){
				q.offer(current.right);
			}
		}
        }

		return res;
	}

    
}
        
