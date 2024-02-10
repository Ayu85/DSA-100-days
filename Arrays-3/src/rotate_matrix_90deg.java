public class rotate_matrix_90deg {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {5, 6, 7}, {9, 10, 11}};
        int[][] res = ratate(a, 3, 3);
        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(res[i][j] + "    ");
            }
            System.out.println();
        }
    }

    static int[][] ratate(int[][] mat, int m, int n) {
        int[][] temp = new int[m][n];
        int y = m-1;
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
