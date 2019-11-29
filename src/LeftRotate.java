import java.util.Scanner;

public class LeftRotate {
    void leftRotate(int arr[], int d, int n)
    {
        //will rotate this loop till
        for (int i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }

    void leftRotatebyOne(int arr[], int n)
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }

    /* utility function to print an array */
    void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        LeftRotate rotate = new LeftRotate();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        Scanner sc = new Scanner(System.in);
        int d= sc.nextInt();
        rotate.leftRotate(arr, d, arr.length);
        rotate.printArray(arr, arr.length);
    }


}
