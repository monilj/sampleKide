import java.util.ArrayList;
import java.util.Scanner;

public class LittleShinoAndCommonFactor {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        ArrayList al=new ArrayList();
        ArrayList bl=new ArrayList();
        ArrayList cl=new ArrayList();
        int a = s.nextInt();
        int b = s.nextInt();
        for(int i=1;i<=a;i++) {
            if(a%i==0)
            {
                al.add(i);
            }

        }
        System.out.println(al);
        for(int j=1;j<=b;j++) {
            if(b%j==0)
            {
                bl.add(j);
            }
        }
        System.out.println(bl);
        for (Object i:al) {
            if(bl.contains(i))
            {
                cl.add(i);
            }
        }
        int si=cl.size();
        System.out.println(si);
    }
    


}
