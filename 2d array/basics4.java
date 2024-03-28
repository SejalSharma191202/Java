//upper lower bound
import java.util.Scanner;

public class basics4{

  int fo(){

  }
   


public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
         int [] arr= {10,20,30,30,30,40,50};
         int i;
        int key=sc.nextInt();
        int  low=0;
        int high=arr.length;
        int mid=(low+high)/2;
         while(low<high)
           {
                if(arr[mid]==key){
                   break;
                } 
                else if(key<arr[mid]){
                    high=mid-1;
                }
                else if(key<arr[mid]){
                    low=mid+1;
                }
           }
           System.out.println(mid);
         
        }

}
