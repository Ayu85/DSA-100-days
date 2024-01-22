public class print_linearly_1_to_n {
    static int i=1;
    static void printN(int n){
        if(i>n) return;
        System.out.println(i++);
        printN(n);
    }
    public static void main(String[] args) {
        printN(5);
    }
}
