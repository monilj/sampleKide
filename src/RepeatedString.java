import com.sun.deploy.util.StringUtils;

import java.util.Scanner;

public class RepeatedString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.next();
        long n=sc.nextInt();
        char [] ch= s.toCharArray();
        long count=0;
        String str="";
       while (str.toCharArray().length<n) {
           for (long i = 0; i < ch.length; i++) {
               str = str + ch[(int) i];
               if((str.toCharArray().length)==n)
                   break;
           }
       }
      char [] ccc= str.toCharArray();



        for(long i=0;i<ccc.length;i++)
        {
            if (ccc[(int) i]=='a')
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
