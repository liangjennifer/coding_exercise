/**
 * Created by jliang1 on 10/11/17.
 *
 * Given an array of integers, every element appears twice except for one. Find that single one.

 Note:
 Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

 */
public class SingleNumber {

    public int singleNumber(int[] nums) {

        if (nums == null)
            return 0;

        int result = 0;
        for (int i = 0; i < nums.length; i++) {


            result ^= nums[i] ;


        }
        return result;

    }
}
