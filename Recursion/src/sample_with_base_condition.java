public class sample_with_base_condition {
    static int c = 1;
    static void recurse() {
        if (c == 4) return;
        System.out.println(c++);
        recurse();
    }

    public static void main(String[] args) {
        recurse();
    }
}
