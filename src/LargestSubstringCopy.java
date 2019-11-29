import java.util.Scanner;

public class LargestSubstringCopy {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //String s = scanner.nextLine();
        char[] ch = {3, 4, 5};
        int len = ch.length;

        for (int i = 0; i < (1 << len); i++) {
            System.out.print("{ ");
            for (int j = 0; j < len; j++)
                if ((i & (1 << j)) > 0)
                    System.out.print(ch[j] + " ");
            System.out.println("}");
        }

    }
    }

//
//        for (int i = 0; i < len; i++)
//        {
//            for (int j = i+1; j <= len; j++)
//                System.out.println(s.substring(i, j));
//                }
//
//        }
