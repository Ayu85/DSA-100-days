import java.util.Arrays;

public class merge_2_sorted_arrays {
    static int[] mergeTwo(int[] arr1, int[] arr2) {
        int[] temp = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                temp[k++] = arr1[i];
                i++;
            } else {
                temp[k++] = arr2[j];
                j++;
            }
        }

        for (int m = i; m < arr1.length; m++)
            temp[k++] = arr1[m];

        for (int m = j; m < arr2.length; m++)
            temp[k++] = arr2[m];

        return temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5,8};
        int[] arr2 = {2, 4, 7, 8};
        System.out.println(Arrays.toString(mergeTwo(arr1, arr2)));
    }
}
