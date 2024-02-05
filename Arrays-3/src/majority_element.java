public class majority_element {
    public static void main(String[] args) {
    int[] nums={2,2,3,3,1,3,3,3};
        System.out.println(getMajority(nums,nums.length));
    }

    static int getMajority(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) count++;
            }
            if (count > n / 2) return nums[i];
        }
        return -1;
    }
}
