import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by jliang1 on 10/11/17.
 *
 * https://leetcode.com/problems/majority-element/description/
 *
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

 You may assume that the array is non-empty and the majority element always exist in the array.

 Credits:
 Special thanks to @ts for adding this problem and creating all test cases.
 *
 */
public class MajorityElement {

    public static int majorityElement(int[] nums) {
        HashMap hm = new HashMap();
        for (int n : nums) {
            if (hm.containsKey(n))
                hm.put(n, ((Integer)hm.get(n))+1);
            else
                hm.put(n, 1);
        }

        int majorityQualifier = nums.length/2;

        Iterator i = hm.entrySet().iterator();
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry)i.next();
            if ((Integer)me.getValue() > majorityQualifier)
                return (Integer)me.getKey();
        }

        return 0;

    }
}


