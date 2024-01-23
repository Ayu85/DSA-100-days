public class print_1_to_n_backtracking {
    public static void main(String[] args) {
        printN(5);
    }
    static void printN(int n){
        if(n==0) return;
        printN(n-1);
        System.out.print(n+" ");
    }
}
