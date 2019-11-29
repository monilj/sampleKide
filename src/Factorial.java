import java.util.Scanner;

public class Factorial {
//    public static void main(String[] args) {
//        int num,fact;
//        Scanner sc = new Scanner(System.in);
//        num = sc.nextInt();
//        fact=1;
//        for(int i=num;i>0;i--)
//        {
//            fact=fact*i;
//        }
//        System.out.println(fact);
//    }

//Alternative logic
    public static void main(String[] args) {
        int num,fact;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }


}
