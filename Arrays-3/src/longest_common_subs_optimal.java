import java.util.Arrays;

public class longest_common_subs_optimal {
    public static void main(String[] args) {
        int[] arr = {102,4,100,1,101,3,2,1,1};
        System.out.println(getLongestSub(arr, arr.length));
    }

    static int getLongestSub(int[] arr, int n) {
        Arrays.sort(arr);
        int max = 1;
        int count = 0;
        int lastSmall = Integer.MIN_VALUE;
        for (int x : arr) {
            if (lastSmall == x - 1) {
                count++;
                lastSmall = x;
            } else if (lastSmall != x) {
                count = 1;
                lastSmall = x;
            }
            max = count > max ? count : max;


        }
        return max;
    }
}
