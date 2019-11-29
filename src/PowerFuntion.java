import java.util.Scanner;

public class PowerFuntion {
    public static void main(String[] args) {


        int a, b,result=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number a:");
        a = sc.nextInt();
        System.out.println("Enter second number b:");
        b=sc.nextInt();
        for (int i=0;i<b;i++)
            result=result*a;
        System.out.println(a +" ^ "+b+" = "+result);
    }
}
