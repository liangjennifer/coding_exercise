import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Created by jliang1 on 11/13/17.
 *
 * You need to find the largest value in each row of a binary tree.

 Example:
 Input:

 1
 / \
 3   2
 / \   \
 5   3   9

 Output: [1, 3, 9]

 https://leetcode.com/problems/find-largest-value-in-each-tree-row/description/
 */
public class FindLargestNumberInTreeRow {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    HashMap<Integer, Integer> hm = new HashMap();

    public List<Integer> largestValues(TreeNode root) {

        walk(root, 1);

        Iterator a =  hm.values().iterator();
        ArrayList<Integer> result = new ArrayList();
        while (a.hasNext()) {
            result.add((Integer)a.next());
        }

        return result;
    }

    public void walk(TreeNode root, int level) {
        if (root == null)
            return;

        if (hm.containsKey(level)) {
            hm.put(level, Math.max(root.val, hm.get(level)));
        } else {
            hm.put(level, root.val);
        }

        walk(root.left, level+1);
        walk(root.right, level+1);
    }
}
