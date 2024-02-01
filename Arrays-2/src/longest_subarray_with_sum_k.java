public class longest_subarray_with_sum_k {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        System.out.println(getLongestSubarray(arr,arr.length,3));
    }

    static int getLongestSubarray(int[] arr, int n, int k) {
        int maxLength = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                int length = 0;
                for (int m = i; m <= j; m++) {
                    sum += arr[m];
                    length++;
                }
                if (sum == k && length > maxLength)
                    maxLength = length;
            }
        }
        return maxLength;
    }
}
