public class reverse {
    public static void main(String[] args) {
        System.out.println(rev("ayush"));
    }

    static String rev(String str) {
        String result = "";
        int start=0;
        int end=str.length()-1;
        while(end>=start){
            result+=str.charAt(end--);
        }
        return result;
    }
}
