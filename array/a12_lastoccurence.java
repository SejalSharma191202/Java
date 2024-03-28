
import java.util.*;
import java.util.*;
public class a12_lastoccurence {
    static Scanner sc=new Scanner(System.in);

    static int lastOccurence(int[]arr,int x)
    {
        int count=-1;
        for(int i=0;i<arr.length;i++){   //arr.leng,0,--i return i
        if(arr[i]==x){
            count=i;
        }}

        return count;
    }


    public static void main(String[] args) {
        int arr[]={1,6,7,5,5};
        int x=sc.nextInt();
        int count=lastOccurence(arr,x);
        if(count==-1)
        {System.out.println("not found");}
       else{ System.out.println(count);}
    }
}

