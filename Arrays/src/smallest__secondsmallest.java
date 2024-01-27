public class smallest__secondsmallest {
    static int getSmallest(int[] arr) {
        int small = arr[0];
        for (int x : arr) {
            if (x < small)
                small = x;
        }
        return small;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 0, -2, 1, 50};
        System.out.println(getSmallest(arr));
    }
}
