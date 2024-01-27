public class left_rotate_by1 {
    public static void main(String[] args) {
        int[] arr={-2,65,1,5};
        rotate(arr);
    }

    static void rotate(int[] arr) {
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = temp;
        for (int x : arr)
            System.out.print(x + " ");
    }
}
