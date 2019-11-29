import java.util.Arrays;
import java.util.Scanner;

public class MinMaxSumArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        long min=0;
        long max=0;
        int [] arr =new int[n];
        for (int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();


        Arrays.sort(arr);
        for (int i=0;i<arr.length-1;i++)
            min+=arr[i];
        for (int i=1;i<arr.length;i++)
            max+=arr[i];
        System.out.println(min+ " "+ max);



    }
}
