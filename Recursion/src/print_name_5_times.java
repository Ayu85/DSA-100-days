public class print_name_5_times {
    static int count=1;
    static void printName(){
        if(count>5) return;
        System.out.println("Aayush "+count);
        count++;
        printName();
    }
    public static void main(String[] args) {
        printName();
    }
}
