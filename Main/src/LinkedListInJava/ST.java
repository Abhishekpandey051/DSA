package LinkedListInJava;

public class ST {
     static class Node{
         int data ;
         Node next;

         Node(int data) {
             this.data = data;
             next = null;
         }
     }
     static class stack{
         public static Node head , temp;
         public void push(int data) {
             Node newnode = new Node(data);
             if (head == null) {
                 head = newnode;
             }else{
                 newnode.next = head;
                 head = newnode;
             }
         }
         public static void pop(){
             if (head == null) {
                 System.out.println("List is empty");
             }else {
                 int top = head.data;
                 head = head.next;
                 System.out.println("Pop element " + top);
             }

         }

         public static void peek() {
             if (head == null) {
                 System.out.println("List is empty");
             }
             else {
                 System.out.println("The element at peek " + head.data);
             }
         }

         public void traverse() {
             if (head == null) {
                 System.out.println("list is empty");
             }
             else {
                 temp = head;
                 while (temp != null) {
                     System.out.print(temp.data + " ");
                     temp = temp.next;
                 }
             }

         }


     }

    public static void main(String[] args) {
         stack s = new stack();
         s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.traverse();
        s.pop();
        s.traverse();
        s.peek();
        s.pop();
        s.pop();

        s.peek();
        s.traverse();
    }
}
