import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n,sum=0,num,r;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        num=n;
        while (n!=0)
        {
            r=n%10;
            sum=sum+r*r*r;
            n=n/10;
        }
        if(sum==num)
        {
            System.out.println("Given number is armstrong number");
        }
        else
            System.out.println("Given number is not armstrong number");

    }
}

