import java.util.ArrayList;
import java.util.List;

/**
 * Created by jliang1 on 10/11/17.
 */
public class Something {

    public static void main (String[] args) {

        System.out.println(" Output ");


        List <Integer> first = new ArrayList<Integer>();
        first.add(1);


        List out = first;
        for (int i = 0; i <= 6; i++ ) {
            out = test(out);
            //System.out.println(" Data " + out);
        }

    }

    public static List<Integer> test( List <Integer> data) {

        int count = 0;
        Integer one = -1;
        List<Integer> output = new ArrayList<Integer>();

        //System.out.println(data.length);


        for (int i = 0; i < data.size() ; i++) {

            if ( one == -1 ) {
                one = data.get(i);
                count++;
            } else if ( one == data.get(i)) {
                count++;
            } else {
                System.out.print( count + " " + one + " ");
                output.add(count);
                output.add(one);

                count = 1;
                one = data.get(i);


            }

        }
        System.out.println( count + " " + one);
        output.add(count);
        output.add(one);
        return output;


    }
}
