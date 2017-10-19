import java.util.Arrays;

/**
 * Created by jliang1 on 10/13/17.
 *
 * https://leetcode.com/problems/maximum-product-of-three-numbers/description/
 *
 * Given an integer array, find three numbers whose product is maximum and output the maximum product.

 Example 1:
 Input: [1,2,3]
 Output: 6
 Example 2:
 Input: [1,2,3,4]
 Output: 24


 */
public class MaxProductOf3Numbers {

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int a = 1;
        int b = 1;
        if (nums.length > 3) {

            a = nums[0] * nums[1] * nums[nums.length-1];
            b = nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3];

            if (a > b)
                return a;
            else return b;
        } else {

            for (int i : nums)
                a *= i;
        }

        return a;
    }
}
