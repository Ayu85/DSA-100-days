import java.util.Arrays;

public class rearrange_elements_by_sign {
    public static void main(String[] args) {
        int[] arr = {2, -1, 3, -5, -4, 5};
        System.out.println(Arrays.toString(arrangeElements(arr, arr.length)));
    }

    static int[] arrangeElements(int[] nums, int n) {
        int[] temp = new int[n];
        int o = 0;
        int p = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                temp[o] = nums[i];
                o += 2;
            }
            else{
                temp[p] = nums[i];
                p += 2;
            }

        }
        return temp;
    }
}
