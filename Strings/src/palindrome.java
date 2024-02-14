public class palindrome {
    public static void main(String[] args) {
        System.out.println(checkPal("C@ivi@ c"));

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

            }
//            in the above checks we ignore the spaces
            else if (str.toLowerCase().charAt(start++) != str.toLowerCase().charAt(end--))
                return false;


        }
        return true;

    }
}
