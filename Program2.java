public class Program2 {
    public static class Node
    {
        int val;
        Node next;
        Node(int val )
        {
            this.val=val;
            this.next=null;
        
        }
        public static void main (String []args)
        {
            Node node1=new Node(1);
            Node node2=new Node(2);
            Node node3=new Node(3);
            Node node4=new Node(4);
            Node node5=new Node(4);
            node1.next=node2;
            node2.next=node3;
            node3.next=node4;
            node4.next=node5;
            Node temp=node1;
            int count=0;
            while(temp!=null)
            {
             
                count++;
                temp=temp.next;
            }

        
        System.out.println("total nodes="+count);
    }
}
}
