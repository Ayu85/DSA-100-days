public class twoSum1 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        System.out.println(isTwoSum(arr, 15));
    }

    static String isTwoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target)
                    return "yes";
            }
        }
        return "no";
    }
}
