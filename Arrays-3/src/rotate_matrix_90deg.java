public class rotate_matrix_90deg {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] res = ratate(a, 4, 4);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(res[i][j] + "    ");
            }
            System.out.println();
        }
    }

    static int[][] ratate(int[][] mat, int m, int n) {
        int[][] temp = new int[m][n];
        int y = 3;
        for (int i = 0; i < m; i++) {
            int x = 0;
            for (int j = 0; j < n; j++) {
                temp[x][y] = mat[i][j];
                x++;
            }
            y--;
        }
        return temp;
    }
}
