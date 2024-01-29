public class max_consecutive_ones {
    static int getMax1s(int[] arr) {
        int max = -1;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                count++;
            else {
                if (count > max)
                    max = count;
                count = 0;
            }
        }
        return max>count?max:count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1};
        System.out.println(getMax1s(arr));
    }
}
