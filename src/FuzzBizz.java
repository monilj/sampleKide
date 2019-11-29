import java.util.Scanner;

public class FuzzBizz {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
                         // Reading input from STDIN

        for(int j=1;j<=T;j++) {
            int N = s.nextInt();
            for (int i = 1; i <= N; i++) {
                if (i % 15 == 0)
                    System.out.println("FizzBuzz");
                else if (i % 5 == 0)
                    System.out.println("Buzz");
                else if (i % 3 == 0)
                    System.out.println("Fizz");
                else
                    System.out.println(i);
            }
        }
    }
}
