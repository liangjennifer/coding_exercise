/**
 * Created by jliang1 on 10/11/17.
 *
 * Given an array and a value, remove all instances of that value in place and return the new length.

 Do not allocate extra space for another array, you must do this in place with constant memory.

 The order of elements can be changed. It doesn't matter what you leave beyond the new length.

 Example:
 Given input array nums = [3,2,2,3], val = 3

 Your function should return length = 2, with the first two elements of nums being 2.

 https://leetcode.com/problems/remove-element/description/
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int idx = 0;
        int dup = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[idx] = nums[i];
                idx++;
            } else
                dup++;

        }

        return nums.length-dup;
    }
}
