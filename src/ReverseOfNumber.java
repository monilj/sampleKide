import java.util.Scanner;

class ReverseOfNumber {
    public static void main(String[] args) {
        int n,rev,sum=0;
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();

        while(n!=0)
        {
            rev=n%10;
            sum=sum*10+rev;
            n=n/10;
        }
        System.out.println(sum);
    }
    }