import java.util.ArrayList;

public class union_of_two_sorted {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 4, 5, 6};
        getUnion(arr1, arr2);
    }

    static void getUnion(int[] arr1, int[] arr2) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                if (temp.isEmpty() || temp.get(temp.size() - 1) != arr1[i]) temp.add(arr1[i]);
                i++;
            } else {
                if (temp.isEmpty() || temp.get(temp.size() - 1) != arr2[j]) temp.add(arr2[j]);
                j++;
            }

        }
        while (i < arr1.length) {
            if (temp.get(temp.size() - 1) != arr1[i]) temp.add(arr1[i]);
            i++;
        }
        while (j < arr2.length) {
            if (temp.get(temp.size() - 1) != arr2[j]) temp.add(arr2[j]);
            j++;
        }
        for (int x : temp)
            System.out.print(x + " ");
    }
}
