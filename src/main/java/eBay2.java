/**
 * Created by jliang1 on 10/18/17.
 */
public class eBay2 {

     1, 2, 3, 4
             3, 4, 5, 6
             5, 6, 7, 8
             6, 7, 8, 9

    int[][] a ;


 for (int i = 0; i < 9; i++) {

        HashMap<Integer, Integer> h = new HashMap();
        for (int j = 0; j <9; j++) {
            if (h.contains(a[i][j]) {
                return true;
            } else {
                h.put(a[i][j], 1);
            }
        }

        HashMap<Integer, Integer> v = new HashMap();
        for (int j = 0; j <9; j++) {
            if (v.contains(a[j][i]) {
                return true;
            } else {
                h.put(a[j][i], 1);
            }
        }
    }


}
