import java.util.Scanner;

public class MinimumBribes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int tItr = 0; tItr < t; tItr++) {
            int n = sc.nextInt();
            int[] q = new int[n];

           // String[] qItems = sc.nextLine().split(" ");

            for (int i = 0; i < n; i++) {
                q[i]=sc.nextInt();
            }
            for (int i = 0; i < q.length; i++) {
                if ((q[i] - (i + 1)) > 2) {
                    System.out.println("Too chaotic");
                    return;
                }
            }

            //now we just need to count number of Swaps
            int swaps = 0;
            for (int i = 0; i < q.length; i++) {
                for (int j = i + 1; j < q.length; j++) {
                    if (q[i] > q[j]) {
                        int tmp = q[j];
                        q[j] = q[i];
                        q[i] = tmp;
                        swaps++;
                    }
                }
            }

            System.out.println(swaps);
        }
    }
}
