public class twoSumOptimal {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 8, 11};
        System.out.println(isTwoSum(arr, 7));
    }

    static boolean isTwoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            if (arr[left] + arr[right] == target)
                return true;
            else if (arr[left] + arr[right] > target)
                right--;
            else
                left++;
        }
        return false;
    }
}
