/**
 * Created by jliang1 on 10/11/17.
 *
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

 For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 the contiguous subarray [4,-1,2,1] has the largest sum = 6.


 */
public class MaxSubarray {

    public static int maxSubArray(int[] nums) {
        Integer sum = null;
        Integer max = null;
        for (int i=0; i < nums.length; i++) {
            sum = 0;
            for (int j=i; j < nums.length; j++) {
                sum += nums[j];
                if (max == null || max < sum)
                    max = sum;
            }
        }
        return max;
    }

    public static void main(String[] arg) {
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(">>> " + MaxSubarray.maxSubArray(a));
    }
}
