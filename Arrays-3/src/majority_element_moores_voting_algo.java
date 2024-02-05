public class majority_element_moores_voting_algo {
    public static void main(String[] args) {
        int[] nums = {7,7,5,7,5,1,5,7,5,5,7,7,5,5,5,5};
        System.out.println(getMajElm(nums, nums.length));
    }

    static int getMajElm(int[] arr, int n) {
        int elm = arr[0];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == elm) count++;
            else count--;
            if (count == 0) {
                elm = arr[i + 1];
                count = 0;
            }
        }
        return elm;
    }
}
