import java.util.Arrays;

public class insertion_sort {
    static void insertionSort(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 1; i < arr.length - 1; i++) {
                if (arr[i] < arr[i - 1]) {
                    while (arr[i] < arr[i - 1] && i >= 0) {
                        int temp = arr[i];
                        arr[i] = arr[i - 1];
                        arr[i - 1] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {14, 9, 15, 12, 6, 8, 13};
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));

    }
}
