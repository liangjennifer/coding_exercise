import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jliang1 on 11/2/17.
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

 Find all the elements that appear twice in this array.

 Could you do it without extra space and in O(n) runtime?

 Example:
 Input:
 [4,3,2,7,8,2,3,1]

 Output:
 [2,3]

 https://leetcode.com/problems/find-all-duplicates-in-an-array/description/

 */
public class FindDuplicates {

    public List<Integer> findDuplicates(int[] nums) {
//        int dupe = 0;
//        ArrayList<Integer> result = new ArrayList();
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[i] == nums[j])
//                    dupe++;
//                if (dupe > 1) {
//                    if (!result.contains(nums[i]))
//                        result.add(nums[i]);
//                    break;
//                }
//            }
//            dupe=0;
//        }
//        return result;

//        List<Integer> res = new ArrayList<Integer>();
//        for (int i = 0; i < nums.length; ++i) {
//            int index = Math.abs(nums[i])-1;
//            if (nums[index] < 0)
//                res.add(Math.abs(index+1));
//            nums[index] = -nums[index];
//        }
//        return res;

        Arrays.sort(nums);
        int now = nums[0];
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 1; i < nums.length; i++) {
            if (now == nums[i])
                a.add(nums[i]);
            now = nums[i];
        }
        return a;
    }

    public static void main(String[] arg) {
        int[] a = {4,3,2,7,8,2,3,1};
        FindDuplicates fd = new FindDuplicates();
        List b = fd.findDuplicates(a);
        System.out.println(b);
    }
}
