import java.util.Arrays;

public class insertion_sort {
    static void insertionSort(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            boolean isMoves=false;
            for (int i = 1; i < arr.length ; i++) {
                while (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    isMoves=true;
                }
            }
            if(isMoves==false) return;
            System.out.println("ran");
        }
    }


    public static void main(String[] args) {
        int[] arr = {5,8,1,-8,0,-1};
        int[] arr2={1,2,3,4,5};
        System.out.println("Array before sorting: " + Arrays.toString(arr2));
        insertionSort(arr2);
        System.out.println("Array after sorting: " + Arrays.toString(arr2));

    }
}
