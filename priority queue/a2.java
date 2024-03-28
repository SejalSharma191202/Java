//k smallest no using priority queue

import java.util.PriorityQueue;

public class a2 {
    public static void main(String[] args) {

        int[] arr={1,5,4,3,2,8};
        int k =3;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int num : arr) {
            pq.add(num);
        }
        while(k>0){
        System.out.print(pq.remove()+" ");
        k--;
        }
    }
}
