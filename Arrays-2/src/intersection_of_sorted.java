import java.util.ArrayList;

public class intersection_of_sorted {
    public static void main(String[] args) {
    int[] a1={1,2,2,3,3,4,5,6};
    int[] a2={2,3,3,5,6,6,7};
    getIntersection(a1,a2);
    }

    static void getIntersection(int[] a, int[] b) {
        ArrayList<Integer> intersection = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                intersection.add(a[i]);
                i++;
                j++;
            } else
                i++;
        }
        for (int x : intersection)
            System.out.print(x + " ");
    }
}
