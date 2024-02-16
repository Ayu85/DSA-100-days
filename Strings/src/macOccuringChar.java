public class macOccuringChar {
    public static void main(String[] args) {
        System.out.println(getMaxChar("output"));
    }

    static char getMaxChar(String str) {
        char max = Character.MAX_LOW_SURROGATE;
        char maxChar=str.charAt(0);
        int i = 0;
        int count = 0;
        int maxCount=Integer.MIN_VALUE;
        while (i < str.length()) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    count++;
                    max=str.charAt(j);
                }
            }
            if(count>maxCount && max>maxChar)
                maxChar=max;

            i++;
        }

        return max;
    }
}
