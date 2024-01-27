import java.util.Arrays;

public class rotate_by_d {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Array before rotation: " + Arrays.toString(arr));
        rotateByd(arr, 3);
        System.out.println("Array before rotation: " + Arrays.toString(arr));
    }

    static void rotateByd(int[] arr, int d) {
        //create a temp array of d size to store the last d elements
        int[] temp = new int[d];
        //store the last d elements into the temp array
        int j = 0;
        for (int i = d + 1; i < arr.length; i++) {
            temp[j++] = arr[i];
        }
        //move the leftover elements to the right side
        for (int i = d; i >=0; i--) {
            arr[i + d] = arr[i];
        }
        //now place the temp array elements to the starting
        for (int i = 0; i < d; i++) {
            arr[i] = temp[i];
        }
    }
}
