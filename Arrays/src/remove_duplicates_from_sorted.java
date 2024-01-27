public class remove_duplicates_from_sorted {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1,2, 2, 2, 3, 3,4};
        removeDuplicates(arr);
    }

    static void removeDuplicates(int[] arr) {
        int i = 0;
        int c = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                c++;
            }
        }
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println("new length: " + (c+1));
    }
}
