import java.util.Arrays;

public class selection_sort {
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr={8,2,3,-2,-9,0,1,4,6};
        System.out.println("Array before sorting: "+ Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Array after sorting: "+ Arrays.toString(arr));
    }
}
