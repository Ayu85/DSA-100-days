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
            if (x == target) hash[x-65]++;

        return hash[target-65];
    }
    public static void main(String[] args) {
        char[] arr = {'r', 'z', 'a', 'r', 'a'};
        char[] arr2={'A','V','A','G','C'};
        System.out.println(getCharCount(arr2, 'O'));
    }
}
