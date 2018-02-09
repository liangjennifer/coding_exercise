/**
 * Created by jliang1 on 12/12/17.
 *
 * A sequence of number is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.

 For example, these are arithmetic sequence:

 1, 3, 5, 7, 9
 7, 7, 7, 7
 3, -1, -5, -9
 The following sequence is not arithmetic.

 1, 1, 2, 5, 7

 A zero-indexed array A consisting of N numbers is given. A slice of that array is any pair of integers (P, Q) such that 0 <= P < Q < N.

 A slice (P, Q) of array A is called arithmetic if the sequence:
 A[P], A[p + 1], ..., A[Q - 1], A[Q] is arithmetic. In particular, this means that P + 1 < Q.

 The function should return the number of arithmetic slices in the array A.


 Example:

 A = [1, 2, 3, 4]

 return: 3, for 3 arithmetic slices in A: [1, 2, 3], [2, 3, 4] and [1, 2, 3, 4] itself.

 https://leetcode.com/problems/arithmetic-slices/description/

 */
public class ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] A) {

        if (A.length < 3)
            return 0;

        if (A.length == 3) {
            int diff = 0;
            if (A[2] - A[1] == A[1] - A[0])
                return 1;
            else return 0;
        }

        int[] index = new int[A.length];
        for (int i = 2; i < A.length; i++) {
            if (A[i] - A[i-1] == A[i-1] - A[i-2]) {
                if (index[i-1] == 0)
                    index[i] = 3;
                else
                    index[i] = index[i-1] + 1;
            }
        }

        int totalSlice = 0;
        for (int i : index) {
            if (i != 0)
                totalSlice += (i-3+1);
        }

        return totalSlice;
    }

    public static void main(String[] arg) {
        ArithmeticSlices as = new ArithmeticSlices();
        int[] slice = {1,2,3,4,5,6};

        System.out.println(as.numberOfArithmeticSlices(slice));
    }

}

