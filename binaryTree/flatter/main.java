import java.util.LinkedList;
import java.util.Stack;

import com.sun.source.tree.Tree;

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
  public void flatten(TreeNode root) {
    Stack<TreeNode> q = new Stack<>();
    if (root == null)
      return;
    q.add(root);
    while (!q.isEmpty()) {
      TreeNode curr = q.pop();
      if (curr.right != null) {
        q.add(curr.right);
      }
      if (curr.left != null) {
        q.add(curr.left);
      }

      if (!q.isEmpty()) {
        curr.right = q.peek();
      }
      curr.left = null;
    }
  }
}
