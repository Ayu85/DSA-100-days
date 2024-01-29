public class missing_num_in_array {
    static int getMissing(int[] arr, int n) {
        int totalSum = (n * (n + 1)) / 2;
        int sum = 0;
        for (int x : arr)
            sum += x;
        return totalSum-sum;
    }

    public static void main(String[] args) {
    int[] arr={1,2,3,5};
        System.out.println(getMissing(arr,5));
    }
}
