public class validPalindrome {
    static boolean checkValid(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
//            char currFirst = s.charAt(start);
//            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(s.charAt(start) )) {
                start++;
            } else if(!Character.isLetterOrDigit(s.charAt(last))) {
                last--;
            } else {
                if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(last))) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
       System.out.println(checkValid("A man, a plan, a canal: Panama"));
        System.out.println(checkValid("race a car"));
        //System.out.println(checkValid("1b1"));

    }
}
