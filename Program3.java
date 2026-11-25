import java.util.*;
public class Program3
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
        public static void main (String []args)
        {
            Scanner sc=new Scanner(System.in);
            Node node1=new Node(1);
            Node node2=new Node(2);
            Node node3=new Node(3);
            Node node4=new Node(4);
            Node node5=new Node(5);
            node1.next=node2;
            node2.next=node3;
            node3.next=node4;
            node4.next=node5;
            int x=sc.nextInt();
            Node temp=node1;
            boolean t=false;
            while(temp!=null)
            {
                if(temp.val==x)
                {
                    t=true;
                break;
                }
                temp=temp.next;

            }
if(t==true)
    System.out.print("FOUND");
else
    System.out.print("not found");

        }
    }
}