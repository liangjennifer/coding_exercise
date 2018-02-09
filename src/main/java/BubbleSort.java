/**
 * Created by jliang1 on 2/5/18.
 */
public class BubbleSort {

    public static void main(String[] a) {

        int[] arr = {12,11,10,9,8,7,6,5,4,3,2,1};

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=tmp;
                    System.out.println("swapping " + count++);
                }
            }
        }

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
