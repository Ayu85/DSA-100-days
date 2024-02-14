public class Comparision {
    public static void main(String[] args) {
        String name = "aayush";
        String name2 = "aayush";//this will result true as both a and b are pointing to same objects in string pool(inside heap memory)
        System.out.println(name == name2);
        String a = new String("kunal");
        String b = new String("kunal");
        System.out.println(a == b); //this will result false as a and b both are allocated new memory locations outside the pool but in the heap only.
        System.out.println(a.equals(b));
    }
}
