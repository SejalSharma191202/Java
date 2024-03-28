
import java.util.*;
public class a13_firstoccurence {
    
        static Scanner sc=new Scanner(System.in);
    
        static int firstOccurence(int[]arr,int x)
        {
            int count=-1;
            for(int i=arr.length-1;i>=0;i--){ // 0,arr.length;i++  return i
            if(arr[i]==x){
                count=i;
            }}
    
            return count;
        }
    
    
        public static void main(String[] args) {
            int arr[]={1,6,7,5,5};
            int x=sc.nextInt();
            int count=firstOccurence(arr,x);
            if(count==-1)
            {System.out.println("not found");}
           else{ System.out.println(count);}
        }
    }
    
    