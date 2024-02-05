public class majority_element_using_hashing {
    static int getElement(int[] nums, int n) {
        int[] hash = new int[n];
        for (int x : nums)
            hash[x]++;
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > n / 2)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 3, 1, 2, 2,2,2};
        System.out.println(getElement(arr,arr.length));
    }
}
