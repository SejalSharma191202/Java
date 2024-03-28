
//merge sort
import java.util.*;
public class a15 {

    public static int ( merger(int[] arr1,int[] arr2){
        int[]arr3= new int[arr1.length+arr2.length];
        int i=0;int j=0; int k=0;


        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k]= arr1[i];
                i++;
                k++;
            }
            else{
                arr3[k]=arr1[j];
                j++;
                k++;
            }
        }
    }
    public static void main(String[] args) {
      int[]  arr1={1,5,10,15,20};
      int[]  arr2={2,4,14,16,17,21,22,23,24};
     int arr[]= merger(arr1,arr2);
    }
}
     