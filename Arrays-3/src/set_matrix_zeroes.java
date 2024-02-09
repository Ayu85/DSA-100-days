public class set_matrix_zeroes {
    public static void main(String[] args) {

    }

    static void markRow(int[] arr, int row) {
        for (int i = 0; i < row; i++)
            if (arr[i] != 0)
                arr[i] = -1;
    }

    static void markCol(int[] arr, int col) {
        for (int i = 0; i < col; i++)
            if (arr[i] != 0)
                arr[i] = -1;
    }

    static void setMatrixZeroes(int[] arr, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[m][n] == 0) {

                }
            }
        }
    }
}
