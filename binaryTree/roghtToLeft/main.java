import java.util.*;
import java.Collections;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
};

class Solution {
    public List<List<Integer>> levelrev(TreeNode root) {
        // to initialize an empty array i mean a queue
        // initialise an res array
        // initialise int lev -> it can be either zero or one
        // traverse through array and do the same as in levelorder
        // when the lev = 0 no change ; but if it is 1 then it will be in opposite
        // direction.

        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        int level = 0;
        if (root == null)
            return res;

        q.offer(root);
        while (!q.isEmpty()) {
            List<Integer> arr = new ArrayList<>();
            int lev = q.size();
            for (int i = 0; i < lev; i++) {
                TreeNode curr = q.poll();
                arr.add(curr.val);
                if (curr.left != null) {
                    q.offer(curr.left);
                }
                if (curr.right != null) {
                    q.offer(curr.right);
                }
            }
            if (level % 2 == 1) {
                Collections.reverse(arr);
            }
            res.add(arr);

            level++;

        }
        return res;

    }
}
