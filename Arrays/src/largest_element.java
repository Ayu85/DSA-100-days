public class largest_element {
    static int getLargest(int[] arr) {
        int max = arr[0];
        for (int x : arr) {
            if (x > max)
                max = x;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr={2,-1,0,4,8,3};
        System.out.println(getLargest(arr));
    }
}
