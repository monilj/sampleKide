import java.util.Scanner;

public class JumpingOnTheClouds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < c.length; i++) {
            c[i] = sc.nextInt();
        }
        int count=0;
          int i=0;
        while(i<c.length-1){
        if(i+2<c.length&&c[i+2]!=1){
        count++;
        i=i+2;
        }
        else{
        count++;
        i++;
        }
        }

        System.out.println(count);

    }
}

//