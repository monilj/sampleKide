import java.util.Scanner;

public class ReverseOfString {
    public static void main(String[] args) {
        String str, rev = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        str = sc.nextLine();

        char ch[] = str.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
        //    rev += ch[i];
            rev = rev + ch[i];
        }
        System.out.println(rev);
    }

}
