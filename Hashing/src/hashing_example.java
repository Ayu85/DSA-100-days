import java.util.Arrays;

public class hashing_example {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {2, 1, 2, 3, 1, 3, 5};
        int[] temp = new int[10];
        for (int x : arr)
            temp[x]++;
        System.out.println(Arrays.toString(temp));
    }
}
