public class fibonacci_recursion {
    static int getfib(int n){
        if(n<=1) return n;
        int first=getfib(n-1);
        int sec=getfib(n-2);
        return first+sec;
    }

    public static void main(String[] args) {
        System.out.println(getfib(4));
    }
}
