import java.util.ArrayList;

public class leaders_in_array {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 5};
        ArrayList<Integer> res = getLeaders(arr, arr.length);
        for (int x : res)
            System.out.print(x + " ");
    }

    static ArrayList<Integer> getLeaders(int[] nums, int n) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean isLeader = true;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] > nums[i]) {
                    isLeader = false;
                    break;
                }
            }
            if (isLeader) temp.add(nums[i]);
        }
//        temp.add(nums[n - 1]);
        return temp;
    }
}
