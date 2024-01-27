public class smallest__secondsmallest {
    static int getSmallest(int[] arr) {
        int small = arr[0];
        for (int x : arr) {
            if (x < small)
                small = x;
        }
        return small;
    }

    static int secSmallest(int[] arr) {
        int small = arr[0];
        int secSmall = small;
        for (int x : arr) {
            if (x < small) {
                secSmall = small;
                small = x;
            } else if (x < secSmall)
                secSmall = x;
        }
        return secSmall;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(secSmallest(arr));
    }
}
