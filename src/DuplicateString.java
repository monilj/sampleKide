import java.util.HashMap;
import java.util.Map;

public class DuplicateString {

    public static void main(String[] args) {
        findDuplicateMethod("this is baest is ");
    }

    private static void findDuplicateMethod(String str) {
        //create string array using split
        String [] words= str.split(" ");
        //Create hashmap
        Map<String, Integer> wordCount = new HashMap<String, Integer>();
        for(String word:words)
        {
            if(wordCount.containsKey("is"));
            wordCount.put("a",2);
        }
    }
}


