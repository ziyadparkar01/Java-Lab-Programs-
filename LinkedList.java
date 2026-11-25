public class LinkedList
{
    public static class Node
    {
        int val;
        Node next;
        Node(int val)
        {
            this.val=val;
            this.next=null;
        }
public static void main(String[] args) {
    Node node1=new Node(1);
    Node node2=new Node(2);
    Node node3=new Node(3);
    node1.next=node2;
    node2.next=node3;
    System.out.println(node1.val+" "+node2.val+" "+node3.val);
}
    }
}