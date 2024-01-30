public class find_the_number_appears_once_HASHING {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2,3, 3, 4, 4};
        System.out.println(getNum(arr,arr.length));
    }

    static int getNum(int[] arr, int n) {
        int[] temp = new int[arr[n - 1] + 1];
        for (int x : arr)
            temp[x]++;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 1) return i;
        }
        return -1;
    }
}
