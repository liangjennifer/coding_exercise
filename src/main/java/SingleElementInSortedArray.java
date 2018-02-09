/**
 * Created by jliang1 on 11/13/17.
 *
 * Given a sorted array consisting of only integers where every element appears twice except for one element which appears once. Find this single element that appears only once.

 Example 1:
 Input: [1,1,2,3,3,4,4,8,8]
 Output: 2
 Example 2:
 Input: [3,3,7,7,10,11,11]
 Output: 10
 https://leetcode.com/problems/single-element-in-a-sorted-array/description/

 */
public class SingleElementInSortedArray {

    public int singleNonDuplicate(int[] nums) {

        if (nums.length < 2)
            return nums[0];
        if ( nums.length%2 == 0)
            return 0;

        int single = -1;
        for (int i = 0 ; i < nums.length; i++) {
            single = nums[i];
            if (i+1 == nums.length || single != nums[++i])
                return single;
        }

        return 0;

    }

    public static void main(String[] a) {
        int[] i = {3,3,7,7,10,10,11};
        SingleElementInSortedArray s = new SingleElementInSortedArray();

        System.out.println(s.singleNonDuplicate(i));
    }
}
