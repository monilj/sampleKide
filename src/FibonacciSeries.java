import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
    int num1,num2,sum=0,num;
    num1=0;
    num2=1;
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("Fibonasi series: ");
        System.out.println(num1);
        System.out.println(num2);
        for(int i=2;i<num;i++)
        {
            sum=num1+num2;
            num1=num2;
            num2=sum;

            System.out.println(sum);
        }
    }
    }

