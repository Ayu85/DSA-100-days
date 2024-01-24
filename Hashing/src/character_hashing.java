public class character_hashing {
    static int getCount(char[] arr, char target) {
        int c = 0;
        for (char x : arr)
            if (x == target) c++;
        return c;
    }

    static int getCharCount(char[] arr, char target) {
        int[] hash = new int[26];
        for (char x : arr)
            if (x == target) hash[x - 97]++;

        return hash[target-97];
    }

    public static void main(String[] args) {
        char[] arr = {'r', 'z', 'a', 'r', 'a'};
        System.out.println(getCharCount(arr, 'x'));
    }
}
