class MaximumDepthofBinaryTree {
    public static class TreeNode {
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
    public int maxDepth(TreeNode root) {

        if(root == null){
            return 0;
        }else {
            int lDepth = maxDepth(root.left);
            int rDepth = maxDepth(root.right);

            if(lDepth > rDepth){
                return (lDepth +1);
            }else{
                return (rDepth +1);
            }
        }
    }
    public static void main(String[] args)
    {
        // steps to make this easier: google how to construct binary trees
        //design this problem as an example user story and find the mvp
        MaximumDepthofBinaryTree tree= new MaximumDepthofBinaryTree();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(7);
        root.right.right= new TreeNode(15);

        System.out.println(tree.maxDepth(root));
    }

}
