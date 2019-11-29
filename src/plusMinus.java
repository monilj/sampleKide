import java.text.DecimalFormat;
import java.util.Scanner;

public class plusMinus {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();

        int [] arr =new int[n];

        double positiveNumbers=0.0;
        double negativeNumbers=0.0;
        double zeros=0.0;
        double fractonPositive;
        double fractonNegative;
        double fractonZero;
        DecimalFormat numberFormat = new DecimalFormat("#.000000");

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
                positiveNumbers++;
            else if(arr[i]<0)
                negativeNumbers++;
            else zeros++;
        }
        fractonPositive=positiveNumbers/n;
        fractonNegative=negativeNumbers/n;
        fractonZero=zeros/n;
        System.out.println(numberFormat.format(fractonPositive));
        System.out.println(numberFormat.format(fractonNegative));
        System.out.println(numberFormat.format(fractonZero));

    }
}
