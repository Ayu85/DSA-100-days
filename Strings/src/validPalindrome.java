public class validPalindrome {
    static boolean checkValid(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start <= end) {
            if (str.charAt(start) < 65 || (str.charAt(start) > 90 && str.charAt(start) < 97)) {
                start++;
                break;
            }
            else if (str.charAt(end) > 122 || (str.charAt(end) > 90 && str.charAt(end) <97)) {
                end--;
                break;
            }
            else {
                if (str.toLowerCase().charAt(start) != str.toLowerCase().charAt(end))
                    return false;

            }
            start++;end--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkValid("A man, a plan, a canal: Panama"));
        System.out.println(checkValid("race a car"));
    }
}
