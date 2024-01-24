import java.util.Arrays;

public class bubble_sort {
    static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 9, 1, 4, 0, -1};
        int[] arr2={13,46,24,52,20,9};
        System.out.println("Array before sorting: " + Arrays.toString(arr2));
        bubbleSort(arr2, arr2.length);
        System.out.println("Array after sorting: " + Arrays.toString(arr2));


    }
}
