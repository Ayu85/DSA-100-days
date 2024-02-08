public class longest_common_subsequence {
    public static void main(String[] args) {
        int[] arr = {102, 4, 100, 1, 101, 3, 2, 1, 1};
        System.out.println(getLongestSub(arr, arr.length));
    }

    static int getLongestSub(int[] nums, int n) {
        int longest = 1;
        for (int i = 0; i < n; i++) {
            int element = nums[i];
            int count = 1;
            while (linearSearch(nums, element + 1)) {
                element+=1;
                count++;
            }
            if (count > longest)
                longest = count;
        }
        return longest;
    }

    static boolean linearSearch(int[] arr, int num) {
        for (int j : arr) {
            if (j == num)
                return true;
        }
        return false;
    }
}
