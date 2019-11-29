public class DiagonalDifferenceArray {
    //In this program we are adding array element diagonally and in reverse direction as well. Then take absolute of the difference.
    public static void main(String[] args) {
        int mat[][]={{11,2,4},
                {4,5,6},
                {10,8,-12}};
        int dignoDiff= findDiff(mat);
        System.out.println(dignoDiff);
    }


    private static int findDiff(int[][] arr) {
        int r =arr[0].length;
        int c=arr[1].length;
        int totalFwd=0;
        int totalbkd=0;
        for(int i=0;i<r;i++)
        {
            totalFwd+=arr[i][i];
            totalbkd+=arr[i][r-1-i];

        }

        int total= Math.abs(totalFwd-totalbkd);
        return total;
    }
}
