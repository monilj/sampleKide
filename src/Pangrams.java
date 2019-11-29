import java.util.HashMap;
import java.util.Scanner;

public class Pangrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str.toUpperCase();
        System.out.println(str);
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        //HashMap<Character,Integer> map2 = new HashMap<Character,Integer>();
        char [] ch = str.toCharArray();
        for(int i=0; i<ch.length;i++)
        {
            if ('A' <= ch[i] && ch[i] <= 'Z')
                if(map.containsKey(ch[i]))
                    continue;
            map.put(ch[i],i);

        }

        if(map.size()==26)
            System.out.print(str + " is a pangram.");
        else
            System.out.print(str + " is not a pangram.");
    }
}
