import java.util.*;
import java.util.HashMap;


public class a1{
    public static void main(String[] args) {
        HashMap<String,Integer> map= new HashMap<>();
        
        map.put("India",100);
        map.put("china",10);

        map.put("aust",40);

        map.put("japan",30);
    
        System.out.println(map);

        int val=map.get("India");
        System.out.println(val);

        // int val1=map.get("ndia");
        // System.out.println(val1);   //agar value exist nhi krti null pointer excep for int


        Integer val1=map.get("Idia");
        System.out.println(val1);   //null   //using Integer



       boolean flag=map.containsKey("India");
       System.out.println(flag);



       map.put("India",40);//overwrite 
       System.out.println(map);

    }
}