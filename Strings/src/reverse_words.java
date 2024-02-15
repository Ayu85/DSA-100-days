public class reverse_words {
    public static void main(String[] args) {
        System.out.println(reverseSentence("hello world"));
    }

    static String reverseSentence(String str) {
        str = str.trim();
        String s = "";
        int i = str.length() - 1;
        int j = i;
        while (j >= 0) {
            if (str.charAt(j) == ' ' || j == 0) {
                s += add(str, i, j);
                i = j - 1;
            }
            j--;

        }
        return s;
    }

    static String add(String str, int start, int end) {
        String result = "";
        for (int i = end; i <= start; i++) {
            result += str.charAt(i);

        }
        return result;
    }

}
