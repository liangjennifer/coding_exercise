import java.util.Arrays;

import static java.util.Arrays.copyOfRange;

/**
 * Created by jliang1 on 10/26/17.
 */
public class array {

    public static void main(String[] args) {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));

        System.out.println(copyOfRange(copyFrom, 2, 9));
    }
}
