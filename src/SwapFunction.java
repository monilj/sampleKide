import java.util.Scanner;

public class SwapFunction {
    //        //using two variables

    public static void main(String[] args) {
        int a, b,temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number a:");
        a = sc.nextInt();
        System.out.println("Enter second number b:");
        b=sc.nextInt();
        System.out.println("Before : "+a+","+b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After : "+a+","+b);
    }



//    // using temp variable
//    public static void main(String[] args) {
//        int a, b,temp;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter first number a:");
//        a = sc.nextInt();
//        System.out.println("Enter second number b:");
//        b=sc.nextInt();
//        System.out.println("Before : "+a+","+b);
//
//        temp=a;
//        a=b;
//        b=temp;
//        System.out.println("After : "+a+","+b);
//
//
//    }
}
