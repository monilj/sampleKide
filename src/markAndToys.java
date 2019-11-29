import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class markAndToys
    {


        public static void main(String[] args) {
            ArrayList<Integer> arrli = new ArrayList<Integer>();
            Scanner s=new Scanner(System.in);
            int noOftoys=s.nextInt();
            int amount=s.nextInt();
            int sum=0;
            int prices[]=new int[noOftoys];
            for(int i=0;i<prices.length;i++)
                prices[i]=s.nextInt();

            for(int j=0;j<prices.length;j++)
            {
                for (int k=1;k<prices.length;k++)
                {
                    if(prices[k-1]>prices[k])
                    {
                        int temp=prices[k-1];
                        prices[k-1]=prices[k];
                        prices[k]=temp;
                    }
                }
            }
            for (int i : prices) {
                    sum =sum + i;
                    if (sum<amount) {
                        arrli.add(i);
                    }
                }
            System.out.println(arrli.size());
            System.out.println(arrli);

        }

        }


