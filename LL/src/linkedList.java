public class linkedList {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }


    }
    static Node head;
    static Node tail;
    public static void main(String[] args) {
        Node n1=new Node(4);
        System.out.println(n1.next);
    }
}
