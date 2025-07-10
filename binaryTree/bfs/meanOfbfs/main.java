



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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode > q = new LinkedList<>();

        q.offer(root);
        while(!q.isEmpty()){
          List<Integer> levAverage = new ArrayList<>();
          Double lev =  q.size();
          for(int i =0; i <lev;i++){
              TreeNode curr = q.poll();
              levAverage.add(curr.val);
              if(curr.left != null)q.offer(curr.left);
              if(curr.right!=null)q.offer(curr.right);
          }
          Double sum = 0;
          for(int levsum:levAverage){
            sum += levsum;
            
          }
          res.add(((sum)/lev)+0.00000);
        
        }

    }
}
