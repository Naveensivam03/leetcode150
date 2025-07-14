public class TreeNode{
    int val;
    TreeNode left , right ;
    TreeNode(){};
    TreeNode(int val){this.val = val;}
    TreeNode(int val  , TreeNode left , TreeNode  right ){
        this.val= val ;
        this.left= left;
        this.right = right;
    }
}


class Solution{
    private int currk = 1;
    private int small = -1;
    public int kthSmallest(TreeNode root  ,  int k ){

        inorder(root , k);
        return small;
    }

    public void  inorder(TreeNode node , int k){
        if(node == null) return  ;
        inorder(node.left , k);
        if(currk == k){
            small =  node.val;
        }
        currk++;
        inorder(node.right , k);
    }
}

public class main{
    public static void main(String[] args){
        //static is used so that we dont need to instantiate the class as object .
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right= new TreeNode(2);

        Solution res = new Solution();
       int r = res.kthSmallest(root , 3);
       System.out.println(r);

    }
}
