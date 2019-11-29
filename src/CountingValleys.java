import java.util.Scanner;

public class CountingValleys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String p=sc.next();
        int lvl=0;
        int valleyCount=0;
        for(char c:p.toCharArray())
        {
            if(c=='U') lvl++;
            if(c=='D') lvl--;
            if(lvl==0 && c=='U')
                valleyCount++;
        }
        System.out.println(valleyCount);

    }
}
