//recursive printing
public class basics2{
     
    public static void displayr(Node head)
    {  //recursion
             if(head==null)
             return;
             
            System.out.print(head.data+" ");
            displayr(head.next);
            System.out.print("\n");
    }
    public static void displayrev(Node head)
    {  // reverse recursion    1 hr 13 min
             if(head==null)
             return;
        
             displayrev(head.next);
            System.out.print(head.data+" ");
    }
    




    public static void display(Node head)
    { 
        Node tempo = head;
        while(tempo!=null)
        {
            System.out.print(tempo.data+" ");
            tempo=tempo.next;  //temp=b ,i=1
        }  
       System.out.println();
    }



    public static class Node
    {
        int data;//value
        Node next;//addr of next node
        Node(int data)
        {
            this.data=data;
        }
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
        

        
        
        display(a); 
        //displayr(a);
       displayrev(a);
    }
 }
 


