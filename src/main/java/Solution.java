import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void transform(String header, ArrayList<String> data) {
        //Assuming from the header, first column is always city, second column is zip, rest are years
        String[] headerToken = header.split(",");

        StringBuilder sb = new StringBuilder();
        sb.append(headerToken[0]); //City
        sb.append(",");
        sb.append(headerToken[1]); // zip
        sb.append(",");
        sb.append("year");
        sb.append(",");
        sb.append("median value");
        System.out.println(sb.toString());

        int numOfYears = headerToken.length - 2;

        for (String dataLine : data) {
            int yearCount = 0;
            while (yearCount < numOfYears) {
                String[] dataToken = dataLine.split(",");
                sb = new StringBuilder();
                sb.append(dataToken[0]); //City
                sb.append(",");
                sb.append(dataToken[1]); // zip
                sb.append(",");
                sb.append(headerToken[yearCount+2]);
                sb.append(",");
                sb.append(dataToken[yearCount+2]);
                System.out.println(sb.toString());
                yearCount++;
            }

        }
    }

    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner in = new Scanner(System.in);
        String header = in.next();
        ArrayList<String> data = new ArrayList<String>();
        String input;
        while ((input = in.next()) != null) {
            data.add(input);
        }

        transform(header, data);
    }
}