/**
 * Created by jliang1 on 11/2/17.
 *
 * Given a binary tree, find the leftmost value in the last row of the tree.

 Example 1:
 Input:

 2
 / \
 1   3

 Output:
 1
 Example 2:
 Input:

 1
 / \
 2   3
 /   / \
 4   5   6
 /
 7

 Output:
 7

 https://leetcode.com/problems/find-bottom-left-tree-value/description/

 */
public class FindBottomLeftTreeValue {



    public static class TreeNode {
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    int depth;
    int value;

    int ans=0, h=0;
    public int findBottomLeftValue(TreeNode root) {
        findBottomLeftValue(root, 1, true);
        return ans;
    }
    public void findBottomLeftValue(TreeNode root, int depth, boolean left) {
        if (h <= depth && left ) {
            ans=root.val;
            h=depth;
        }
        if (root.left!=null) findBottomLeftValue(root.left, depth+1, true);
        if (root.right!=null) findBottomLeftValue(root.right, depth+1, false);
    }

    public static void main(String[] arg) {
        FindBottomLeftTreeValue f = new FindBottomLeftTreeValue();

        TreeNode t = new TreeNode(2);
        t.left = new TreeNode(1);
        t.right = new TreeNode(3);
        TreeNode t1 = new TreeNode(4);
        t1.left = new TreeNode(5);
        t1.right = t;

        System.out.println(f.findBottomLeftValue(t1));
    }
}
