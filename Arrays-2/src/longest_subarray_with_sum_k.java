public class longest_subarray_with_sum_k {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        System.out.println(getLongestSubarray(arr, arr.length, 3));
    }

    static int getLongestSubarray(int[] arr, int n, int k) {
        int maxLength = -1;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            int length = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                length++;
                if (sum == k && length > maxLength)
                    maxLength = length;
            }
        }
        return maxLength;
    }
}
