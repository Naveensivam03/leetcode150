public class TreeNode {
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0, inorder.length - 1, 0, preorder, inorder);
    }

    public TreeNode helper(int start, int end, int preStart, int[] preorder, int[] inorder) {
        if (start > end)
            return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int index = 0;
        for (int i = start; i <= end; i++) {
            if (root.val == inorder[i]) {
                index = i;
            }
        }

        root.left = helper(start, index - 1, preStart + 1, preorder, inorder);
        root.right = helper(index + 1, end, preStart + index - start + 1, preorder, inorder);
        return root;
    }
}

public class main {
    public static void main(String[] args) {
        int[] inorder = { 9, 3, 15, 20, 7 };
        int[] preorder = { 3, 9, 20, 15, 7 };
        Solution sol = new Solution();
        TreeNode res = sol.buildTree(preorder, inorder);
        System.out.println(res);
    }
}

// preorder will always gives the root , left , right.
// inorder always gives left , root , right .
//
// first in preorder will always be the root
// find the preorder in the inorder and the element before that are of left
// subtree and those on right will be right subtree.
// do it recursively.
//
