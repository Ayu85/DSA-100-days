import java.util.ArrayList;
import java.util.Arrays;

public class merge_sort {
    static void mergeSort(int[] arr, int start, int end) {
        while (start < end) {
            int mid = (start + end) / 2;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, start, mid, end);
            start++;
            end--;
        }
    }

    static void merge(int[] arr, int start, int mid, int end) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i = 0;
        int j = mid;
        while (i < mid && j < end) {
            if (arr[i] < arr[j]) temp.add(arr[i++]);
            else temp.add(arr[j++]);
        }
        while (i < mid)
            temp.add(arr[i++]);
        while (j < end)
            temp.add(arr[j++]);
        for (int x = 0; x < temp.size(); x++) {
            arr[x] = temp.get(x);
        }

    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 1, 5, 2, 6, 4};
        System.out.println("Array before sorting: ");
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, arr.length);
        System.out.println("Array after sorting: ");
        System.out.println(Arrays.toString(arr));
    }
}
