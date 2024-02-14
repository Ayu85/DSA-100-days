public class validPalindrome {
    static boolean checkValid(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if ((s.charAt(start) < 65 || (s.charAt(start) > 90 && s.charAt(start) < 97)) ||
                    s.charAt(start) > 122
            ) {
                start++;
//                break;
            }
            if ((s.charAt(end) > 122 || (s.charAt(end) > 90 && s.charAt(end) < 97)) || s.charAt(end) < 65) {
                end--;
//                break;
            }
            if (s.toLowerCase().charAt(start) != s.toLowerCase().charAt(end))
                return false;
            System.out.println(s.charAt(start)+", "+s.charAt(end));
            start++;
            end--;

        }
        return true;
    }

    public static void main(String[] args) {
       // System.out.println(checkValid("A man, a plan, a canal: Panama"));
        System.out.println(checkValid("0P"));
        //ystem.out.println(checkValid("  a."));

    }
}
