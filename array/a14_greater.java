//count no of elements strictly greater than target

import java.util.*;

public class a14_greater {
    
        static Scanner sc=new Scanner(System.in);
    
        static void greaterThan(int[]arr,int x)
        {
           for (int i:arr) {
            if(i>x)
            System.out.println(i+" ");
           }
        }
    
    
        public static void main(String[] args) {
            int arr[]={1,6,7,5,5};
            int x=sc.nextInt();
            greaterThan(arr,x);
           
        }
    }
    
    
