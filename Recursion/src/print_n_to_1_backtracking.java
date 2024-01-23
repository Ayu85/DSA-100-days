public class print_n_to_1_backtracking {
    static void printNums(int i, int n) {
        if (i > n) return;
        printNums(i + 1, n);
        System.out.println(i);

    }

    public static void main(String[] args) {
        printNums(1, 5);
    }
}
