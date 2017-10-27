/**
 * Created by jliang1 on 10/23/17.
 *
 * Given a binary tree, find its maximum depth.

 The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.


 https://leetcode.com/problems/maximum-depth-of-binary-tree/description/

 */
public class MaxDepthOfBinaryTree {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;

          TreeNode(int x) {
              val = x;
          }
      }

        public int maxDepth(TreeNode root) {

          int right = 0;
          int left = 0;

          if (root == null)
              return 0;
          if (root.left == null && root.right == null)
              return 1;

          right += maxDepth(root.right);
          left += maxDepth(root.left);

          return Math.max(right, left) + 1;

        }
}


