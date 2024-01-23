public class sum_1_to_n {
    static int sum(int i, int n, int totalSum) {
        if (i > n) return totalSum;
        return sum(i + 1, n, totalSum + i);
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 5, 0));
    }
}
