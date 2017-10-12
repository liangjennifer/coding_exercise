/**
 * Created by jliang1 on 10/11/17.
 *
 * https://leetcode.com/problems/number-complement/description/
 *
 *Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

 Note:
 The given integer is guaranteed to fit within the range of a 32-bit signed integer.
 You could assume no leading zero bit in the integer’s binary representation.
 Example 1:
 Input: 5
 Output: 2
 Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
 Example 2:
 Input: 1
 Output: 0
 Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.

 */
public class NumberComplement {



    public static void main(String[] arg) {

        int num = 5;
        String bitString = Integer.toBinaryString(num);

        System.out.println(Integer.parseInt(bitString, 2));

        String reverse = "";
        for (int i = 0; i < bitString.length(); i++) {
            if (bitString.charAt(i) == '0') {
                reverse += 1;
            } else
                reverse += 0;
        }

        System.out.println(Integer.parseInt(reverse, 2));
    }
}
