import java.util.ArrayList;
import java.util.Scanner;

public class LittleShinoAndCommonFactor3 {
    static ArrayList al = new ArrayList();

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int i=1;
        while (i<=a || i<=b )
        {
            if(a%i==0 && b%i==0)
                al.add(i);
            i++;
        }
        System.out.println(al.size());

    }
}