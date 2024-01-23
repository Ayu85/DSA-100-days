import java.util.Arrays;

public class hashing_example {
    static int getOccur(int[] arr, int n, int target) {
        //creating a hash array
        int[] temp = new int[n+1];
//        storing the count of each element of original array in hash array
        for (int x : arr)
            temp[x]++;
//        fetching the count of required element from the hash array
        return temp[target];
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 3, 1, 3, 5,0,1,10};
        System.out.println(getOccur(arr,10,10));
    }
}
