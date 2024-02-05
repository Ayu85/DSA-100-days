public class max_subarray_kanades_algo {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(getMaxSum(arr, arr.length));
    }

    static int getMaxSum(int[] nums, int n) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int x : nums) {
            sum += x;
            if (sum > maxSum)
                maxSum = sum;
            if (sum < 0)
                sum = 0;
        }
        return  maxSum;
    }
}
