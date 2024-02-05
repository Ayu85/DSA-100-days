public class max_subarray_kanades_algo {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] arr2 = {2};
        System.out.println(getMaxSum(arr2, arr2.length));
    }

    static int getMaxSum(int[] nums, int n) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        if (n == 1) return nums[0];
        for (int x : nums) {
            sum += x;
            if (sum > maxSum)
                maxSum = sum;
            if (sum < 0)
                sum = 0;
        }
        return maxSum;
    }
}
