import java.util.Scanner;

/**
 * Created by jliang1 on 1/22/18.
 */
public class IsPrime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        for(int a0 = 0; a0 < p; a0++){
            int n = in.nextInt();

            boolean isPrime = true;
            if (n == 1)
                isPrime = false;
            else if (n == 2)
                isPrime = true;
            else {
                int factor = (int)Math.sqrt(n) + 1;
                for (int i = 2; i <= factor; i++) {
                    if (n % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.println("Prime");
            } else {
                System.out.println("Not prime");
            }
        }
    }
}
