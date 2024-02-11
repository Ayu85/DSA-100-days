public class spiral_matrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printSpiral(arr, 3, 3);
    }

    static void printSpiral(int[][] mat, int m, int n) {
        int top = 0;
        int left = 0;
        int bottom = n - 1;
        int right = m - 1;
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
    }
}
