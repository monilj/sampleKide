import java.util.HashSet;
import java.util.Set;

public class DistinctElementInArray {
    public static void main(String[] args) {
        int ar[] = {10, 5, 3, 4, 3, 5, 6, 6, 10, 4};
        Set ss= new HashSet();
        for(int i=0;i<ar.length;i++)
        {
            ss.add(ar[i]);
        }

        System.out.println(ss);
    }
}
