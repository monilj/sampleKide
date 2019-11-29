import java.util.ArrayList;
import java.util.Scanner;

class markAndToys2
    {


        public static void main(String[] args) {
            ArrayList<Long> arrli = new ArrayList<>();
            Scanner s=new Scanner(System.in);
            long noOftoys=s.nextInt();
            long amount=s.nextInt();
            long sum=0;
            long prices[]=new long[(int) noOftoys];
            for(long i=0;i<prices.length;i++)
                prices[(int) i]=s.nextInt();

            for(long j=0;j<prices.length;j++)
            {
                for (long k=1;k<prices.length;k++)
                {
                    if(prices[(int) (k-1)]>prices[(int) k])
                    {
                        long temp=prices[(int) (k-1)];
                        prices[(int) (k-1)]=prices[(int) k];
                        prices[(int) k]=temp;
                    }
                }
            }
            for (long i : prices) {
                    sum =sum + i;
                    if (sum<amount) {
                        arrli.add(i);
                    }
                }
            System.out.println(arrli.size());
            System.out.println(arrli);

        }

        }


