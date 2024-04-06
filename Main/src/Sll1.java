import java.util.Arrays;

public class Sll1 {
    Node head,temp;
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void findMiddle(){
        while (head.next != null) {
            head = head.next;
            if (head.next != null) {
                head = head.next;
                 temp = temp.next;
            }
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        Sll1 sl = new Sll1();
        sl.head = new Node(1);
        sl.head = new Node(2);
        sl.head = new Node(3);
        sl.head = new Node(4);
        sl.findMiddle();



    }
}
