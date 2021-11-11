import java.util.Deque;
import java.util.LinkedList;

public class ValidateBinarySearchTree {
      public  class TreeNode {
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


          private Deque<TreeNode> rootStack = new LinkedList<>();
          private Deque<Integer> lowerLimits = new LinkedList<>();
          private Deque<Integer> upperLimits = new LinkedList<>();

          public void updateTree(TreeNode root, Integer low, Integer high) {
              rootStack.add(root);
              lowerLimits.add(low);
              upperLimits.add(high);
          }

          public boolean isValidBST(TreeNode root) {
              Integer low = null;
              Integer high = null;
              updateTree(root, low, high);

              while (!rootStack.isEmpty()) {
                  root = rootStack.poll();
                  low = lowerLimits.poll();
                  high = upperLimits.poll();

                  if (root == null) continue;
                    val = root.val;

                    if(low!=null && val<=low)return false;
                    if(high!=null && val>=high)return false;

                    updateTree(root.right, val, high);
                    updateTree(root.left, low,val);

              }
              return true;
          }
      }
}
