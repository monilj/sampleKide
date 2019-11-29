import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        int sum=0,n;
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        System.out.println(n);
        for(int i=1;i<n;i++)
        {
                if(n%i==0)
                {
                    sum=sum+i;

                }
            }
            if(sum==n)
            {
                System.out.println("It is perfect no");
            }
            else
                System.out.println("It is not a perfect no");
        }
    }

