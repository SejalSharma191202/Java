//basics declarartion
import java.util.*;
import java.util.PriorityQueue;
public class a1{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();//highest pripority is lowest number
        pq.add(10);
        pq.add(5);
        pq.add(25);
        System.out.println(pq.peek());
        System.out.println(pq.size()+" " +pq);
        pq.add(21);
        pq.add(20);
        System.out.println(pq.size()+" " +pq);

        pq.add(2);
        System.out.println(pq.remove());//will remove the smallest element
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());//empty
      //  System.out.println(pq.remove());// nosuchelementexception 
        System.out.println(pq.peek());//null


      

        PriorityQueue<Integer> pq1=new PriorityQueue<>(Collections.reverseOrder());// higheest priority is highest number
        pq1.add(10);
        pq1.add(5);
        pq1.add(25);
        System.out.println(pq1.peek());
        System.out.println(pq1.size()+" " +pq1);

    }
}