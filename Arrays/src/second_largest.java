public class second_largest {
    static int getSecondLargst(int[] arr) {
        int max = arr[0];
        int secMax = max;
        for (int x : arr) {
            if (x > max) {
                secMax = max;
                max = x;
            }
            else if(x>secMax)
                secMax=x;

        }
        return secMax;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,4,6,8,7};
        System.out.println(getSecondLargst(arr));
    }
}
