public class set_matrix_zeroes_better {
    static void setZeroes(int[][] arr, int m, int n) {
        int[] rowMarker = new int[m];
        int[] colMarker = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    rowMarker[i] = 1;
                    colMarker[j] = 1;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rowMarker[i] == 1 || colMarker[j] == 1)
                    arr[i][j] = 0;
            }
        }
    }

    static void printMatrix(int[][] arr, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "    ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 0, 1}, {1, 1, 1, 1}};
        System.out.println("Before marking zeroes");
        printMatrix(arr, 4, 4);
        System.out.println("After marking zeroes");
        setZeroes(arr, 4, 4);
        printMatrix(arr, 4, 4);
    }
}
