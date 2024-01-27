public class move_zeroes_to_end {
    static void moveZeroesToEnd(int[] arr, int n) {
        int j = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] != 0) {
                if (arr[j] != 0) j++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        for (int x : arr)
            System.out.print(x + " ");

    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 3, 2, 0, 0, 4, 5, 1};
        moveZeroesToEnd(arr, arr.length);

    }
}
