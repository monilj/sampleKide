import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int a[] = {2,8,3,9,1,5,4,7};
        int value,hole;
        for(int i=1;i<a.length;i++)
        {
            value=a[i];
            hole=i;
            while (hole>0 && a[hole-1]>value)
            {
                a[hole]=a[hole-1];
                hole=hole-1;
            }
            a[hole]=value;
        }
        for(int ele:a)
        {
            System.out.println(ele);
        }
    }
}

