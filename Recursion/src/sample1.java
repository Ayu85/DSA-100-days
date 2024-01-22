public class sample1 {
    static void fun(){
        System.out.println(1);
        fun();
    }
    public static void main(String[] args) {
        fun();
    }
}
