import java.util.*;

//linear search using iteration

public class a6_linearsearch {
    public static int srch(int[] arr,int key ){
       
         int s=-1;
       for(int n=0;n<arr.length;n++){
           if(key==arr[n]){
           s=n;
           break;
       }}
       return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
    
        int key=sc.nextInt();
        if(srch(arr,key)==-1){ System.out.println("not there");

        }
        else{
        System.out.println(srch(arr,key));}

    }
}

