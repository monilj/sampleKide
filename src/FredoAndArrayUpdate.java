import java.util.Scanner;

public class FredoAndArrayUpdate {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        int sum=0;
        for(int i: arr){ //for printing array
            sum+=i;
        }

        int i =(arr[n-2]*n);
        System.out.println(i);
    }
}
