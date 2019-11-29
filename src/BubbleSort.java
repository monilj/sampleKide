public class BubbleSort {
    public static void main(String[] args) {

        int[] arr1 = {10, 34, 2, 56, 7, 67, 88, 42};
        int[] arr2 = doBubbleSort(arr1);
        for (int i : arr2) {
            System.out.print(i);
            System.out.print(", ");
    }
}
    private static int[] doBubbleSort(int[] arr1) {
        for (int j = 0; j < arr1.length; j++) {


            for (int i = 1; i < arr1.length; i++)
                if (arr1[i-1] > arr1[i]) {
                      int temp=arr1[i-1];
                      arr1[i-1]=arr1[i];
                      arr1[i]=temp;
                }
        }
            return arr1;
        }
}
