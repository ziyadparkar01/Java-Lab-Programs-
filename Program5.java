import java.util.*;
public class Program5
{
    public static class Node{
        int val;
        Node next;
        Node(int val)
        {
            this.val=val;
            this.next=null;
        }
        public static void main (String [] args)
        {
            Scanner sc=new Scanner(System.in);
            Node node1=new Node(1);
            Node node2=new Node(2);
            Node node3=new Node(3);
            node1.next=node2;
            node2.next=node3;
            System.out.println("Enter the value of the New Node");
            int x=sc.nextInt();

            Node newnode=new Node(x);
            node3.next=newnode;
            Node temp=node1;
            while(temp!=null)
            {
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
        }
    }
}