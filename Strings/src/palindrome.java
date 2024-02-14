public class palindrome {
    public static void main(String[] args) {
        System.out.println(checkPal("c@ivi@ c"));

    }

    static boolean checkPal(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start <= end) {
            if (str.charAt(start) == ' ') {
                start++;
                break;
            } else if (str.charAt(end) == ' ') {
                end--;
                break;

            } else if (str.charAt(start++) != str.charAt(end--))
                return false;


        }
        return true;

    }
}
