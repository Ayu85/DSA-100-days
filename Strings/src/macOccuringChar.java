import java.util.Arrays;

public class macOccuringChar {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getMaxChar("textsample")));
    }

    static int[] getMaxChar(String line) {
        int[] arr = new int[26];
        for (int i = 0; i < line.length(); i++) {
            int count = 0;
            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == line.charAt(i))
                    
            }

        }
        return arr;
    }
}
