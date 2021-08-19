import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInOrderTraversal {

    public static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;
        //ctors
        TreeNode(){};
        TreeNode(int val){
            this.value=val;
        }
        TreeNode(int val, TreeNode l, TreeNode r){
            this(val);
            this.left =l;
            this.right=r;
        }
        public static List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> result = new ArrayList<>();
            Stack<TreeNode> stack= new Stack<>();
            TreeNode currentNode = root;

            while(currentNode != null || !stack.isEmpty()){
                while(currentNode != null){
                    stack.push(currentNode);
                    currentNode=currentNode.left;
                }
                currentNode=stack.pop();
                result.add(currentNode.value);
                currentNode=currentNode.right;
            }
            return result;
        }

    }
    public static void main(String[] args) {

        TreeNode le = new TreeNode(2);
        TreeNode ri = new TreeNode(3);
        TreeNode tester = new TreeNode(1,le,ri);
        System.out.println(TreeNode.inorderTraversal(tester));

    }
}

