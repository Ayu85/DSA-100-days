public class subarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printSubarray(arr, arr.length);
    }

    static void printSubarray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
