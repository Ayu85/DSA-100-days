public class fibonacci {
    static void getfib(int n) {
        int first = 0;
        int second = 1;
        System.out.print(first + " " + second + " ");
        for (int i = 0; i <= n - 3; i++) {
            int sum = first + second;
            first = second;
            second = sum;
           System.out.print(sum + " ");

            if (i== n -3)
                System.out.println("nth :"+ sum);
        }
    }

    public static void main(String[] args) {
        getfib(10);
    }
}
