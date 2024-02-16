public class macOccuringChar {
    public static void main(String[] args) {
        System.out.println(getMaxChar("abcdefabcdef"));
    }

    static char getMaxChar(String str) {
        char max = str.charAt(0);
        char maxChar = str.charAt(0);
        int i = 0;
        int count = 0;
        int maxCount = Integer.MIN_VALUE;
        char prev='a';
        while (i < str.length()) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    count++;
                    max = str.charAt(j);

                }
            }
            if (count > maxCount) {
              maxChar=max;
            }
            else if(count==maxCount)
            {
                prev=max>maxChar?max:maxChar;
            }
            i++;
        }

        return prev;
    }
}
