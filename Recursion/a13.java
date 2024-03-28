//return all indexes

import java.util.ArrayList;
import java.util.List;

public class a13 {
    public static int alloccur(int[] arr, int key, int inde)
     {
        
        if (inde == arr.length) 
        { 
        
            return inde;
        }
        
       
             int a[]=new int[arr.length];
            
            ArrayList allindexes = new ArrayList<>();
            if (arr[inde] == key) 
            {    
               
                inde=allindexes.add(inde);

            }
          
            
             return alloccur(arr, key, inde + 1);
             
             
    }



    public static void main(String args[]){
        int[] arr = {1, 2, 3, 4, 2, 5};
        int key = 2;

         alloccur(arr, key, 0);
        
        
        
    }
}


