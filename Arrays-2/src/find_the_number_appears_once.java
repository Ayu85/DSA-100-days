public class find_the_number_appears_once {
    static int getNum(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) count++;
            }
            if (count == 1) return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4};
        System.out.println(getNum(arr, arr.length));
    }
}
