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
        int previous = 0;
        for (int i : nums) {
            if (i - previous > 1)
                return ++previous;
            else
                previous = i;
        }

        return 0;
    }

    public static void main(String[] arg) {
        int[] a = {0,1,2,3,5,6};
        System.out.println(MissingNumber.missingNumber(a));
    }
}
