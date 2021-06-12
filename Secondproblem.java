public class Secondproblem 
{
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
    void pairWiseSwap()
    {
        Node temp = head;
        while (temp != null && temp.next != null) 
        {
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
        }
    }
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    void display()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Secondproblem llist = new Secondproblem();
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);
        llist.display();
        llist.pairWiseSwap();
        llist.display();
    }
}
