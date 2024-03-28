import java.util.*;

//maxm no using iteration

public class a5_maxno {
    public static int maxof(int[] arr ){
       
         int max=-432848736;
       for(int n=0;n<arr.length;n++){
           max=Math.max(arr[n],max);

           }
       
       return max;
    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
        }
    
        
        
        System.out.println(maxof(arr));
    }
}

