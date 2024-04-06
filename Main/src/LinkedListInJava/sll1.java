package LinkedListInJava;

import org.w3c.dom.CDATASection;

public class sll1 {
    Node head ,temp;
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    //! Traversing the linked list
    private void traverse() {
        if (head == null) {
            System.out.println("List is empty: ");
        }else {
            temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
//  Pushing the data in the linked list
    public void push(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;

        }else{
            temp.next = newNode;
        }
        temp = newNode;

    }
    public static void main(String[] args) {
        sll1 sl = new sll1();
        sl.traverse();
        sl.push(3);
        sl.push(3);
        sl.push(3);
        sl.push(3);
        sl.traverse();
        sl.traverse();


    }
}
