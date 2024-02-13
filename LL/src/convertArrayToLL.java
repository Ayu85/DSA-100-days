public class convertArrayToLL {
    static Node convertArray(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    static void traverseLL(Node head) {
        int count=0;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
            count++;
        }
        System.out.println();
        System.out.println("Length: "+count);
    }

    public static void main(String[] args) {
        int[] arr = {10, 12, 14, 16};
        Node headNode = convertArray(arr);
        traverseLL(headNode);

    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}