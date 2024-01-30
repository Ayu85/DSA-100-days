public class find_the_number_appears_once_XOR {
    static int getNum(int[] arr, int n) {
        int ans = 0;
        for (int x : arr)
            ans = ans ^ x;

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2,2, 3, 3, 4};
        System.out.println(getNum(arr,arr.length));

    }
}
