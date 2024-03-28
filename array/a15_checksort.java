//check given array sorted or not

import java.util.*;
public class a15_checksort {
    


    
        static Scanner sc=new Scanner(System.in);
    
        static boolean isSorted(int[]arr)
    { 
            int i=1;
            
          while(i<arr.length) 
        {
             if(arr[i]>=arr[i-1])
               i++;
        
            else
                return false;
        }
               return true;
               
    }
        
    
        public static void main(String[] args) {
            int arr[]={1,2,3,4};
             

            if(isSorted(arr)==true)
            
            System.out.println("sorted");
            
            else
            System.out.println("unsorted");

        }
    }
    
    
