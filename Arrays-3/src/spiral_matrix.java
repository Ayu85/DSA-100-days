public class spiral_matrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3,4,5}, {16,17,18,19,6}, {15,24,25,20,7},{14,23,22,14,8},{13,12,11,10,9}};
        printSpiral(arr, 5, 5);
    }

    static void printSpiral(int[][] mat, int m, int n) {
        int top = 0;
        int left = 0;
        int bottom = n - 1;
        int right = m - 1;

        while(left<=right&&top<=bottom){
            for (int i = left; i <= right; i++) {
                System.out.print(mat[top][i] + " ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(mat[i][right] + " ");
            }
            right--;
            for (int i = right; i >= left; i--) {
                System.out.print(mat[bottom][i] + " ");
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                System.out.print(mat[i][left] + " ");
            }
            left++;
        }

    }
}
