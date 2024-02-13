public class creation {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 4, 8};
        Node head= new Node(arr[0]);
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
