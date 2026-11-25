import java.util.*;

public class Program4 {
    public static class Node{
        int val;
        Node next;
        Node(int val)
        {
            this.val=val;
            this.next=null;

        }
    }
        public static void main(String [] args)
        {
            Scanner sc=new Scanner (System.in);
            Node node1=new Node(1);
            Node node2=new Node(2);
            Node node3=new Node(3);
            Node node4=new Node(4);
            node1.next=node2;
            node2.next=node3;
            node3.next=node4;
            System.out.println("Enter the value of new node ");
            int x=sc.nextInt();
            Node newnode=new Node(x);
            newnode.next=node1;
            Node temp=newnode;
            while(temp!=null)
            {
                System.out.print(temp.val+" ");
                temp=temp.next;
            }


        }
    
    
}
