import java.util.Arrays;

/**
 * Created by jliang1 on 10/12/17.
 *
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

 For example,
 Given nums = [0, 1, 3] return 2.

 Note:
 Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?

 https://leetcode.com/problems/missing-number/description/


 */
public class MissingNumber {

    public static int missingNumber(int[] nums) {

        Arrays.sort(nums);
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);

//        for (int i = 0; i < nums.length; i++){
//            if (i != nums[i])
//                return i;
//        }
//        return 0;
    }

    public static void main(String[] arg) {
        int[] a = {-2, -1, 4, 5, 6};
        System.out.println(MissingNumber.missingNumber(a));
    }
}
