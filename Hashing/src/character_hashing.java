public class character_hashing {
    static int getCount(char[] arr, char target) {
        int c = 0;
        for (char x : arr)
            if (x == target) c++;


        return c;
    }

    public static void main(String[] args) {
        char[] arr = {'r', 'z', 'a', 'r', 'a'};
        System.out.println(getCount(arr, 'a'));
    }
}
