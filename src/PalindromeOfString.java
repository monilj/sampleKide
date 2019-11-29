import java.util.Scanner;

public class PalindromeOfString {
    public static void main(String args[])
    {
        String str, rev = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        str = sc.nextLine();
//
//        int length = str.length();
//
//        for ( int i = length - 1; i >= 0; i-- )
//            rev = rev + str.charAt(i);
//
//        if (str.equals(rev))
//            System.out.println(str+" is a palindrome");
//        else
//            System.out.println(str+" is not a palindrome");



//        using split method
        String[] ss= str.split("\\s");
        System.out.println(ss);
        for(int i=ss.length-1;i>=0;i--)
        {
            rev+=ss[i]+" ";
        }
        System.out.println(rev);
    }
}
