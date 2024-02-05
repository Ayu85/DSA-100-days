public class max_subarray_sum {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(getMaxSum(arr, arr.length));
    }

    static int getMaxSum(int[] arr, int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            int sum=0;
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                if (sum > max)
                    max = sum;
            }
        }
        return max;
    }
}
