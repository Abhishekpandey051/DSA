public class DeleteNode {
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    public void push(int new_data)
    {

        Node new_node = new Node(new_data);

        new_node.next = head;

        head = new_node;
    }
    void delete(int position)
    {

        if (head == null)
            return;

        Node temp = head;

        if (position == 0)
        {
            head = temp.next;
            return;
        }

        for (int i=0; temp!=null && i<position-1; i++)
            temp = temp.next;

        if (temp == null || temp.next == null)
            return;

        Node next1 = temp.next.next;

        temp.next = next1;
    }

    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }

    public void taverse()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }
    public static void main(String[] args) {
        DeleteNode dl = new DeleteNode();
        dl.push(7);
        dl.push(2);
        dl.push(5);
        dl.push(1);
dl.taverse();
        dl.delete(2);
        dl.taverse();


    }
}
