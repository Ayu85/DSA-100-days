import java.util.ArrayList;
import java.util.Arrays;

public class rearrange_by_sign_variety_2 {
    static int[] reArrange2(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int x : nums) {
            if (x < 0)
                a.add(x);
            else
                b.add(x);
        }
        for (int x : a)
            System.out.print(x + " ");
        for (int x : b)
            System.out.print("bbb" + x + " ");
        int m = 0;
        int n = 0;
        int i;
        for (i = 0; i < nums.length && m < a.size() && n < b.size(); i++) {
            if (i % 2 == 0) {
                nums[i] = a.get(m);
                m++;
            } else {
                nums[i] = b.get(n);
                n++;
            }
        }
        return nums;

    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, -4};
        System.out.println(Arrays.toString(reArrange2(arr)));
    }
}
