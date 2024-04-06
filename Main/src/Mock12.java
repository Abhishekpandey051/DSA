//Reverse every odd index word in the string.
//        Test Case 2:
//        String s = "Saurav Anand is my interviewer today"
//        output : Saurav dnanA is ym interviewer yadot

public class Mock12 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    static class Stack {
        public static Node head, temp;

        public static void push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }



        public static void display(){
            if (head == null) {
                System.out.println("List is empty");
            }else {
                temp = head;
                while (temp != null) {
                    System.out.println(temp.data + " ");
                    temp = temp.next;
                }
            }
        }
        public static void pop() {
            if (head == null) {
                System.out.println("List is empty");
            } else {
                int top = head.data;
                head = head.next;
                System.out.println("Pop item is " + top);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack sl = new Stack();
        sl.push(1);
        sl.push(2);
        sl.push(3);
        sl.display();
        sl.pop();
        sl.display();

    }
}


