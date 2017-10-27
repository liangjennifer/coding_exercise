/**
 * Created by jliang1 on 10/26/17.
 */
public class SumOf2Numbers {

    public static int getSum(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;

        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;

            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("carry = " + carry);
        }

        return a;
    }

    public static void main(String[] arg) {
        System.out.println(SumOf2Numbers.getSum(4,5));
    }
}
