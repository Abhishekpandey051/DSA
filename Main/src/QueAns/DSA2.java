package QueAns;

public class DSA2 {
    static class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next =null;
        }
    }
    static class SLL{
        public static Node head,temp;

        public void push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
               temp = head = newNode;
            }else {
                temp.next = newNode;
            }
            temp = newNode;
        }
        public void delete(){
            if (head == null) {
                System.out.println("List is empty");
            }else{
                System.out.print("Delete item is " + head.data + " ");
                head = head.next;
            }
            System.out.println();
        }

        public void traverse() {
            if (head == null) {
                System.out.println("List is empty");
            }else{
                temp = head;
                while (temp != null) {
                    System.out.print( temp.data);
                    temp = temp.next;
                }
            }
        }
    }


    public static void main(String[] args) {
        SLL sl = new SLL();
        sl.push(1);
        sl.push(2);
        sl.push(3);
        sl.push(4);
//        sl.traverse();
        sl.delete();
        sl.traverse();

    }
}
