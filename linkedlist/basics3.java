//length of linked list




public class basics3 {
    
    public static class Node{
        int data;//value
        Node next;//addr of next node
        Node(int data){
            this.data=data;
        }
    }
    public static int length(Node a){
        int count=0;
        while(a!=null)
        {
            count++;
            a=a.next;
        }  
        return count;

        }

    
   public static void main(String[] args) {

    Node a = new Node(2);
    Node b = new Node(1);
    Node c = new Node(4);
    Node d = new Node(3);
    Node e = new Node(6);
      
    a.next=b;
    b.next=c;
    c.next=d;
    d.next=e;

    System.out.println(length(a));
   }

}
