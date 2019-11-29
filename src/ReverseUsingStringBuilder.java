import java.util.Scanner;

public class ReverseUsingStringBuilder {
    public static void main(String[] args) {

        String str, rev;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        str = sc.nextLine();
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        rev = sb.toString();
        System.out.println(rev);
    }
}
