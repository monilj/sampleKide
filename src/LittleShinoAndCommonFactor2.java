import java.util.ArrayList;
import java.util.Scanner;

public class LittleShinoAndCommonFactor2 {
    static ArrayList al = new ArrayList();

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int g = greater(a,b);
        int noOfFactor= commonFactor(g,a,b);
        System.out.println(noOfFactor);
    }
    public static int greater(int a, int b)
    {
        if(a>b)
            return a;
        else
            return b;
    }

    public static int commonFactor(int greater,int a,int b) {
    for (int k=1;k<=greater;k++)
    {
        if(a%k==0 && b%k==0)
            al.add(k);
    }

    return al.size();
    }
}