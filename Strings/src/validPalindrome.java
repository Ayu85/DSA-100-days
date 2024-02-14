public class validPalindrome {
    static boolean checkValid(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start <= end) {
            if (str.charAt(start) < 65 || (str.charAt(start) > 90 && str.charAt(start) < 97))
                start++;
            else if (str.charAt(end) < 97 || (str.charAt(end) > 90 || str.charAt(end) > 122))
                end--;
            else {
                if (str.toLowerCase().charAt(start++) != str.toLowerCase().charAt(end--))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkValid("A man, a plan, a canal: Panama"));
        System.out.println(checkValid("m@add*am"));
    }
}
