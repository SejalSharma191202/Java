//linked list basics
/*limitation in arrays:
  1.fixed size
  2.continuous array //contiguous
  * get 0(1)
  3. insert in between  o(n) time limit of insertion
  4. arraylist growing  o(n)
     

  //linked list 
  1. continous memory allocate in hoti sbko
 */
 public class basics1{
    public static void display(Node head){ 
        Node tempo = head;
        while(tempo!=null){
            System.out.print(tempo.data+" ");
            tempo=tempo.next;  //temp=b ,i=1
        } System.out.println();
    }
    public static class Node{
        int data;//value
        Node next;//addr of next node
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node x = new Node(1);
        System.out.println(x.data); //1
        System.out.println(x.next);  //null
       

        Node a = new Node(2);
        System.out.println(a.next);  //null
        Node b = new Node(1);
        Node c = new Node(4);
        Node d = new Node(3);
        Node e = new Node(6);
          
        //2 - 1 - 4 - 3 - 6
        a.next=b;
        System.out.println(a.next);  //basics1$Node@36baf30c
        System.out.println(b);   //basics1$Node@36baf30c
        

       //printing b using a
       System.out.println(b.data);  
       System.out.println(a.next.data);

        //conecting all the data of linklist
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println(d.next.data);  //value of e
        System.out.println(a.next.next.next.next.data);  //using a printing e

        //using for loop to print a .. a=headnode
        Node temp=a;
        for(int i=1;i<=5;i++){
            System.out.println(temp.data);
            temp=temp.next;  //temp=b ,i=1
        }

        //using while loop
        
        display(a); //we temprory node so that hmara head null hone k bd wapas initial value lele
        display(a);
    }
 }
 //types of linked list
 /*
  1) singly linked list
  2) doubly linked list   //   | addr prev |  data  |   addr nxt  |
  3) circular linked list





  */
