import java.util.Iterator;
import java.util.Scanner;

public class LargestSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        String s = scanner2.nextLine();
        char [] ch= s.toCharArray();
        int len =ch.length;

        for (int i = 0; i < len-1; i++)
        {
                //System.out.println(s.substring(i, i+1));
                if(ch[i]>ch[i+1])
                {
                    System.out.println(s.substring(i,len).length());
                    break;
                }

        }

    }
}
