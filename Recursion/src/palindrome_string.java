public class palindrome_string {   //civic
    static boolean checkString(String str, int start, int end) {
        if (start > end || str.toLowerCase().charAt(start) != str.toLowerCase().charAt(end)) return false;
        checkString(str, start + 1, end - 1);
        return true;
    }

    public static void main(String[] args) {
        String str = "large";
        System.out.println(checkString(str, 0, str.length() - 1));
    }
}
