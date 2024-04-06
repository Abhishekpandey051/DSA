package DSA2Easy;

public class SllOperation {
    Node head;
    Node temp,tail;
    static class Node{
        int data;
        Node next;
        Node (int data){
            this.data = data;
            next = null;
        }
    }
    public void push(int data){
        Node newNode = new Node(data);
        if (head == null) {
            head=temp=newNode;
        }else{
            temp.next = newNode;
        }
        temp = newNode;
    }

    public void delete(){
        if (head == null) {
            System.out.println("List is empty: ");
        }else{
            System.out.println("The deleted element is " +  head.data);
            head = head.next;
        }
    }
    public void traverse(){
        if (head == null) {
            System.out.println("List is empty" );
        }else {
            temp = head;
            while (temp != null) {

                System.out.print( temp.data + " ");
                temp = temp.next;
            }
        }
        System.out.println();
    }
    public void InsertAtHead(int data){
        Node newTail = new Node(data);
        if (head == null) {
            head = tail = newTail;
        }else {
            newTail.next = head;
        }
        head =  newTail;
    }
    public void reverseNode() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node preNode = head;
            Node currNode = head.next;
            while (currNode != null) {
                Node nextNode = currNode;
                currNode.next = preNode;


                preNode = currNode;
            }
            head.next = null;
            head = preNode;
        }
    }
    public static void main(String[] args) {
        SllOperation sl = new SllOperation();
        sl.push(4);
        sl.push(5);
        sl.push(6);
        sl.push(3);
        sl.traverse();
//        sl.delete();
//        sl.traverse();
//        sl.InsertAtHead(1);
//        sl.InsertAtHead(3);
//        sl.traverse();
//        sl.delete();
//        sl.traverse();
        sl.reverseNode();
        sl.traverse();
    }
}
