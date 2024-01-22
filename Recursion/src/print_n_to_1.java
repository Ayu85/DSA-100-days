public class print_n_to_1 {
    static void printN(int n){
        if(n==0) return;
        System.out.println(n);
        printN(n=n-1);
    }
    public static void main(String[] args) {
        printN(5);
    }
}
