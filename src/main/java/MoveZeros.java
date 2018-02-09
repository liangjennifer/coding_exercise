import java.util.Arrays;

/**
 * Created by jliang1 on 12/12/17.
 *
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

 For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

 Note:
 You must do this in-place without making a copy of the array.
 Minimize the total number of operations.

 https://leetcode.com/problems/move-zeroes/description/

 */
public class MoveZeros {

    public void moveZeroes(int[] nums) {

        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
    }}

    public static void main(String[] arg) {
        MoveZeros mz = new MoveZeros();
        int[] a = {7,0,1,0,3,0,4,5};
        mz.moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }
}
