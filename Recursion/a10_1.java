//recursive max by sir

import java.util.*;
public class a10_1 {


    public static int findMax(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            
            return arr[idx];
        }
   
     int temp=findMax(arr,idx+1);
     if(arr[idx]>temp){
        temp=arr[idx];
     }
     return temp;
    }

    public static void main(String[] args) {
        int[] arr =  {1,5,3,4};
        int max = findMax(arr, 0);
        System.out.println(max);
    }
}

      

