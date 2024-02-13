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
    static void addAtFirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public static void main(String[] args) {


    }
}
