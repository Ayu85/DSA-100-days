public class rotate_matrix_optimal {
    static int[][] rotateMatrix(int[][] arr, int m, int n) {
        int[][] temp = new int[m][n];
        int x = 0;
        for (int i = 0; i < m; i++) {
            int y = 0;
            for (int j = 0; j < n; j++) {
                temp[j][i] = arr[i][j];
                y++;
            }
            x++;
        }
        return temp;
    }

//    static void printMatrix(int[][] arr, int m, int n) {
//
//        for (int i = 0; i < m; i++) {
//
//            for (int j = 0; j < n; j++) {
//                System.out.print(arr[i][j] + "    ");
//            }
//            System.out.println();
//        }
//    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotateMatrix(a, 3, 3);
        int[][] res = rotateMatrix(a, 3, 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(res[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
