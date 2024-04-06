public class ReverseLinkedList {
    int data;
    static Node head, temp,prev;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static class reverse {
        private void traverse() {
            if (head == null) {
                System.out.println("List is empty");
            } else {
                temp = head;
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
            }
            System.out.println();
        }

        private void push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
        }

        private void ReverseTheList() {
            if (head == null || head.next == null) {
                System.out.println("List is empty");
            }
            Node pointer = head;
            Node previous = null, current = null;

            while (pointer != null) {
                current = pointer;
                pointer = pointer.next;

                // reverse the link
                current.next = previous;
                previous = current;
                head = current;
            }

        }
    }

    public static void main(String[] args) {
        reverse ls = new reverse();
        ls.push(3);

        ls.push(4);
        ls.push(5);
        ls.traverse();
        ls.ReverseTheList();
        ls.traverse();
    }
    }
