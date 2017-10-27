import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jliang1 on 10/26/17.
 *
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

 Find all the elements of [1, n] inclusive that do not appear in this array.

 Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

 Example:

 Input:
 [4,3,2,7,8,2,3,1]

 Output:
 [5,6]

 https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

 */
public class FindAllNumberDisappearedInArray {



    public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> result = new ArrayList();
        ArrayList<Integer> numsA = new ArrayList();



        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            numsA.add(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {

            if (!numsA.contains(i+1))
                result.add(i+1);

            System.out.println(i + " ==> " + result);
        }

        return result;
    }

    public static void main(String[] arg) {
        int[] a = { 4,3,2,7,8,2,3,1};
       System.out.println( "___" + FindAllNumberDisappearedInArray.findDisappearedNumbers(a));
    }
}
