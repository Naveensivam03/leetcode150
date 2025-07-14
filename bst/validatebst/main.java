public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    };

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
    public boolean isValidBST(TreeNode root) {
        System.out.println(Long.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean validate(TreeNode root, long min, long max) {
        if (root == null)
            return true;

        if (root.val <= min || root.val >= max)
            return false;

        return validate(root.left, min, root.val) && validate(root.right, root.val, max);
    }
}

public class main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);

        Solution sol = new Solution();
        System.out.println(sol.isValidBST(root));
    }
}
