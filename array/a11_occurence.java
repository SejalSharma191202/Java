//element kitne baar occur hua
import java.util.*;
public class a11_occurence {
    static Scanner sc=new Scanner(System.in);

    static int countOccurence(int[]arr,int x)
    {
        int count=0;
        for(int i=0;i<arr.length;i++){
        if(arr[i]==x){
            count++;
        }}

        return count;
    }


    public static void main(String[] args) {
        int arr[]={5,6,7,5,5};
        int x=sc.nextInt();
        int count=countOccurence(arr,x);
        if(count==0)
        {System.out.println("not found");}
       else{ System.out.println(count);}
    }
}
