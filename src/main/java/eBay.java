import java.util.ArrayList;

/**
 * Created by jliang1 on 10/11/17.
 *
 *
 *
 * Print pattern

 Input: No. of rows=4
 Output:

 // only 1 1 => 2     1 2 =>
 // count , number

 // input is line number ( for loop ) and on each end we need a br
 // if we are at the first itt , print 1
 // on other itter => ( count/no of occurances ,  number ) of the perv row => we need the prev row to be saved and passed to be checked


 1
 1 1
 2 1
 1 2 1 1

 1 1 1 2 2 1
 3 1 2 2 1 1
 1 3 1 1 2 2 2 1
 1 1 1 3 2 1 3 2 1 1


 */

public class eBay {

    public class Node {

        public int count;
        public int value;
        Node next = null;

        public Node(int value, int count) {
            this.value=value;
            this.count=count;
        }
    }

    Node n = new Node(1,1);


    public void printLine(int n) {
        ArrayList<Integer> previous = new ArrayList();
        ArrayList<Integer> current = new ArrayList();
        int count =0;
        int a = 1;
        previous.add(1);

        for (int i =0; i < n; i++) {
                count = 0;

                int pointer = previous.get(0);
                for (Integer j : previous) {
                    if (pointer == j)
                        count++;
                    else {
                        System.out.print(count + " " + pointer + " ");

                        current.add(count);
                        current.add(pointer);
                        pointer = j;
                        count = 1;
                    }
                }

                current.add(count);
                current.add(pointer);
                System.out.println(count + " " + pointer);
                previous = current;
                current = new ArrayList<Integer>();


        }
    }


    public static void main(String[] arg) {
            eBay a = new eBay();
            a.printLine(4);
    }

}