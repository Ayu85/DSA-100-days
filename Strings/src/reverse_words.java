public class reverse_words {
    public static void main(String[] args) {
        System.out.println(reverseSentence("a good   example"));
    }

    static String reverseSentence(String str) {
        str = str.trim();
        String s = "";
        int i = str.length() - 1;
        int j = i;
        while (j >= 0) {
            if (str.charAt(j) == ' ' || j == 0) {
                int start = i;
                int end = j == 0 ? j : j + 1;
                String temp = add(str, start, end);
                if (!temp.equals(" ")) s += temp;
                i = j - 1;
                temp = " ";
            }
            j--;

        }
        return s.trim();
    }

    static String add(String str, int start, int end) {
        String result = "";
        for (int i = end; i <= start; i++) {
            result += str.charAt(i);

        }
        return result + " ";
    }

}
