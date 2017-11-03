import java.util.Arrays;

/**
 * Created by jliang1 on 10/29/17.
 *
 * https://leetcode.com/problems/maximum-binary-tree/description/
 *
 * Given an integer array with no duplicates. A maximum tree building on this array is defined as follow:

 The root is the maximum number in the array.
 The left subtree is the maximum tree constructed from left part subarray divided by the maximum number.
 The right subtree is the maximum tree constructed from right part subarray divided by the maximum number.
 Construct the maximum tree by the given array and output the root node of this tree.

 Example 1:
 Input: [3,2,1,6,0,5]
 Output: return the tree root node representing the following tree:

 6
 /   \
 3     5
 \    /
 2  0
 \
 1
 Note:
 The size of the given array will be in the range [1,1000].
 *
 */
public class MaxBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int findMaxIndex(int[] nums) {
        int max = 0;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                index = i;
            }
        }

        return index;
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {

        if (nums == null || nums.length == 0)
            return null;

        int index = findMaxIndex(nums);
        TreeNode root = new TreeNode(nums[index]);
        if (index > 0) {
            root.left = constructMaximumBinaryTree(Arrays.copyOfRange(nums, 0, index));
        }
        root.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums, index+1, nums.length));

        return root;
    }

    public static void main(String[] arg) {
        MaxBinaryTree mbt = new MaxBinaryTree();

        int[] a = {3,2,1,6,0,5};
        TreeNode t = mbt.constructMaximumBinaryTree(a);

    }

}
