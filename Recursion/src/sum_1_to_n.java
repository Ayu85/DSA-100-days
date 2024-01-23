public class sum_1_to_n {
    static int sum( int n, int totalSum) {
        if (n>5) return totalSum;
        return sum(n + 1, totalSum + n);
    }

    public static void main(String[] args) {
        System.out.println(sum( 1, 0));
    }
}
