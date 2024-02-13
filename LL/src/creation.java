public class creation {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 4, 8};
        Node head = new Node(arr[0]);
        Node mover=head;
        for (int i = 1; i < arr.length-1; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover=temp;
        }


    }
}

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
