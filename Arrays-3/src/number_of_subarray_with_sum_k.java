public class number_of_subarray_with_sum_k {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        System.out.println(getCountOfSubarray(arr,arr.length,3));
    }

    static int getCountOfSubarray(int[] arr, int n, int target) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i ; j < n; j++) {
                sum += arr[j];
                if (sum == target) count++;
            }
        }
        return count;
    }
}
