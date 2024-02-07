import java.util.ArrayList;

public class leaders_optimal {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 1};
        ArrayList<Integer> res = getLeaders(arr, arr.length);
        for (int x : res)
            System.out.print(x + " ");
    }

    static ArrayList<Integer> getLeaders(int[] arr, int n) {
        ArrayList<Integer> temp = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > max) {
                temp.add(arr[i]);
                max = arr[i];
            }
        }
        return temp;
    }
}
