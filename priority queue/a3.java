//k largest no


    import java.util.Collections;
    import java.util.PriorityQueue;

public class a3 {
    public static void main(String[] args) {

        int[] arr={1,5,4,3,2,8};
        int k =3;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for (int num : arr) {
            pq.add(num);
        }
        while(k>0){
        System.out.println(pq.remove());
        k--;
        }
    }
}
    

