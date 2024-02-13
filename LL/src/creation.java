public class creation {
    public static void main(String[] args) {
        Node n1=new Node(2);
    }
}
class Node {
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
    }
    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
