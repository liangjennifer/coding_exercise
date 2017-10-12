/**
 * Created by jliang1 on 10/11/17.
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.

 Example:
 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].

 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        int index1 = 0;
        int index2 = 0;
        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            index1 = i;
            for (int j = i + 1; j < nums.length; j++) {
                index2 = j;
                if (nums[i] + nums[j] == target) {
                    found = true;
                    break;
                }
            }
            if (found)
                break;
        }

        System.out.println("index1 = " + index1);
        System.out.println("index2 = " + index2);

        return new int[] {index1, index2};
    }
}
