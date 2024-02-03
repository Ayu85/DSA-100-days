import java.util.Arrays;

public class twoSum2 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        System.out.println(Arrays.toString(getIndices(arr, 14)));
    }

    static int[] getIndices(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }
}
