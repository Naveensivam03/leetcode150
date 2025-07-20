import java.awt.List;
import java.util.ArrayList;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode() {
  }

  TreeNode(int val) {
    this.val = val;
  }

  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}

class Solution {
  public int sumNumbers(TreeNode root) {
    return dfs(0, root);
  }

  public int dfs(Integer a, TreeNode root) {
    if (root == null) {
      return 0;
    }
    a = a * 10 + root.val;
    if (root.left == null && root.right == null) {
      return a;
    }
    return dfs(a, root.left) + dfs(a, root.right);

  }
}

public class main {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(4);
    root.left = new TreeNode(9);
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(1);
    root.right = new TreeNode(0);
    Solution s = new Solution();
    System.out.println(s.sumNumbers(root));
  }
}
