import java.util.Scanner;

public class AlienLanguageTranslator implements LanguageTranslator {

    public static void main(String[] args) {
        AlienLanguageTranslator a1 = new AlienLanguageTranslator();
        String abc = a1.fromDefaultLanguage("python");
        String bbn = a1.toDefaultLanguage(abc);
        System.out.println(abc.trim());
        System.out.println(bbn.trim());

    }

    @Override
    public String fromDefaultLanguage(String languageTokens) {
      //  Scanner s = new Scanner(System.in);
       // String s1= s.next();
        int x=2;
        String s2=" ";
        char [] ch =languageTokens.toCharArray();
        for (char ele:ch)
        {
            ele+=x;
            s2=s2+ele;

        }
        return s2;
    }

    @Override
    public String toDefaultLanguage(String languageTokens) {
        //Scanner s = new Scanner(System.in);
        //String s1= s.next();
        int x=2;
        String s2=" ";
        char [] ch =languageTokens.toCharArray();
        for (char ele:ch)
        {
            ele-=x;
            s2=s2+ele;

        }
        return s2;
    }
}
