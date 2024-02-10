public class temp {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] temp = new int[3][3];
        int x=2;
        for (int i = 0; i < 3; i++) {
            int y=0;
            for (int j = 0; j < 3; j++) {
                temp[y][x]=a[i][j];
                y++;
            }
            x--;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(temp[i][j] + "    ");
            }
            System.out.println();
        }
    }
}
