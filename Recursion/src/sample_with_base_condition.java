public class sample_with_base_condition {
    static int c = 0;
    static void recurse() {
        System.out.println(c++);
        if (c == 10) return;
        recurse();
    }

    public static void main(String[] args) {
        recurse();
    }
}
