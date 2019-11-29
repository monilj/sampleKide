import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeCandles {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr =new int[n];
        int candleCount=0;
        for (int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();

        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++) {
            int tallestCandle=arr[arr.length-1];
            if(arr[i]==tallestCandle)
                candleCount++;
        }
        System.out.println(candleCount);
    }

}
