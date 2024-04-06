package LinkedListInJava;

public class SingliLikedList {
    int data;
    Node next;
    Node head, temp;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    //Traversing the new node
    static class stack {
        Node temp,head;
        private void traverse() {
            if (head == null) {
                System.out.println("List is empty. ");
            } else {
                temp = head;
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
                System.out.println();
            }
        }

        //Creating the new node
        private void push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
        }

        //Deleting the node int he list
        private void delet() {
            if (head == null) {
                System.out.println("list is empty");
            } else {
                System.out.println("Your deleted item is " + head.data);
                head = head.next;
            }
        }
    }

    public static void main(String[] args) {
       stack sl = new stack();
       sl.traverse();
       sl.push(4);
        sl.push(5);
        sl.push(8);
        sl.traverse();
        sl.delet();
        sl.traverse();
}
}
