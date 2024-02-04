import java.util.Arrays;

public class sort_0_1_2_array {
    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 2
        };
        System.out.println("Array before sorting: ");
        System.out.println(Arrays.toString(nums));
        System.out.println("Array after sorting: ");
        sortArray(nums, nums.length);
        System.out.println(Arrays.toString(nums));
    }

    static void sortArray(int[] nums, int n) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int x : nums) {
            if (x == 0) count0++;
            else if (x == 1) count1++;
            else count2++;
        }
        for (int i = 0; i < count0; i++) nums[i] = 0;
        for (int i = count0; i < count0 + count1; i++) nums[i] = 1;
        for (int i = count1 + count0; i < n; i++) nums[i] = 2;
    }
}
