import java.util.HashMap;


public class a2 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map= new HashMap<>();

          
        map.put(0,100);
        map.put(10,10);

        map.put(3,40);

        map.put(0,30);
    
        System.out.println(map);


        for(int key: map.keySet()){
           int val=map.get(key);
            System.out.println(key+" "+val);
        }
    }
}
