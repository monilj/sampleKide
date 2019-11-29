import sun.tools.jstat.Scale;

import java.util.Scanner;
import java.util.StringTokenizer;

public class RevereOfStringPart2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        //String sc = scanner.next();
        String st;
        String ss= "";
        String sc = "Prakash now you can see me";
        StringTokenizer st1 =
                new StringTokenizer(sc, " ");
        while (st1.hasMoreTokens()) {
            StringBuilder sb = new StringBuilder(st1.nextToken());
             st= sb.reverse().toString();
            System.out.println(st);
             ss=ss+" "+st;
//            System.out.println(st1.nextElement());

        }
        System.out.println(ss);
    }
}
