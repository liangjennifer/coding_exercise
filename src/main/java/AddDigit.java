/**
 * Created by jliang1 on 10/24/17.
 *
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

 For example:

 Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

 Follow up:
 Could you do it without any loop/recursion in O(1) runtime?


 https://leetcode.com/problems/add-digits/description/

 */
public class AddDigit {

    public static int addDigits(int num) {
//        boolean notSingle = true;
//        int newNum = num;
//        int sum = 0;
//        String n = ""+newNum;
//        while (notSingle) {
//
//            sum = 0;
//            for (char c : n.toCharArray()) {
//                sum += Integer.parseInt(""+c);
//            }
//
//            n = ""+sum;
//
//            if (n.length() == 1)
//                notSingle = false;
//
//
//        }
//
//        return sum;
        return num==0?0:(num%9==0?9:(num%9));
    }

    public static void main(String[] a) {
       System.out.println(AddDigit.addDigits(17));
    }
}
