public class set_matrix_zeroes {
    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 0, 1}, {1, 1, 1, 1}};
        System.out.println("Before marking zeroes");
        printMatrix(arr, 4, 4);
        System.out.println("After marking zeroes");
        setMatrixZeroes(arr, 4, 4);
        printMatrix(arr, 4, 4);

    }

    static void markRow(int[][] arr, int row) {
        for (int i = 0; i < arr.length; i++)
            if (arr[row][i] != 0)
                arr[row][i] = -1;
    }

    static void markCol(int arr[][], int col) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i][col] != 0)
                arr[i][col] = -1;
    }

    static void printMatrix(int[][] arr, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "    ");
            }
            System.out.println();
        }
    }

    static void setMatrixZeroes(int[][] arr, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    int row = i;
                    int col = j;
                    markRow(arr, row);
                    markCol(arr, col);
                }
            }
        }
    }


}
