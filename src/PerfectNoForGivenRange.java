import java.util.Scanner;

public class PerfectNoForGivenRange {
//      Take random number as input
//    public static void main(String[] args) {
//        int i,n,sum;
//        for(n=0;n<500;n++)
//        {
//            sum=0;
//            i=1;
//            while(i<n)
//            {
//                if(n%i==0)
//                    sum=sum+i;
//                i++;
//
//            }
//            if(sum==n)
//                System.out.println(n);
//        }
//    }


    //Take input number from user
    public static void main(String[] args) {
        int i,j,n,sum;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            sum=0;
            j=1;
            while(j<i)
            {
                if(i%j==0)
                    sum=sum+j;
                j++;

            }
            if(sum==i)
                System.out.println(i);
        }
    }
}
