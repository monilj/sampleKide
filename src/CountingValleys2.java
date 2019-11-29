import java.util.Scanner;

public class CountingValleys2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        String p=sc.next();
        int lvl=0;
        int valleyCount=0;
        char [] ch=p.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='U')
                lvl++;
            else lvl--;

            if(lvl==0 && ch[i]=='U')
                valleyCount++;
        }
        System.out.println(valleyCount);

    }
}
