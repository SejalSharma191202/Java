//array refernce in java
import java.util.*;
public class a7_arrayreference {
static Scanner sc=new Scanner(System.in);

    public static void printarr(int[]arr){
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }


   
    public static void main(String[] args) {
        int[] arr=new int[5];
        int[] arr2=new int[5];

        for(int i=0;i<arr.length;i++)
       {
        arr[i]=sc.nextInt();
       }

       //int [] arr2=arr;
        arr2=arr;  //upr arr2 define krdiya h
        System.out.println("or");
       printarr(arr);

       System.out.println("cop");
       printarr(arr2);
        

       //changing copied array
       arr2[0]=0;
       arr2[1]=0;

       System.out.println("or after chnge");
       printarr(arr);    //humne changes  sirf arr2 me ki thi wo arr me bhi aai

       System.out.println("cop  after chn");
       printarr(arr2);

    }
}
