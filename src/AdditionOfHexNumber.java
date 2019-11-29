import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import java.util.*;

public class AdditionOfHexNumber {

    public static void main(String[] args) {
        List<String> hex= Arrays.asList("30","8","3A","FF");
        Collections.sort(hex);
        Object key;
        Comparator c;
        int x=Collections.binarySearch(hex, "8");
        int y=Collections.binarySearch(hex, "3A");
        int z=Collections.binarySearch(hex, "4F");
        System.out.println(x + " " + y + " " +z);
    }
}
