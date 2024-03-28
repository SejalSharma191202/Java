import java.util.HashMap;
import java.util.Map;

public class a4 {
    public static void main(String[] args) {
        String str = "__________   +";

        
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
         
            char ch=str.charAt(i);

            if(map.containsKey(ch)){
                int of=map.get(ch);
                map.put(ch,of+1);


            }

            else{
                map.put(ch,1);
            }


        }
      
       char ans=str.charAt(0);
       for(char ch: map.keySet()){
        if(map.get(ch)>map.get(ans)){
            ans=ch;

             
        }
       }

        System.out.println(ans);
       
    }
}
