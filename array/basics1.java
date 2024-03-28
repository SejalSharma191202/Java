import java.util.Scanner;
public class basics1{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[n];

        int i,j;
        for(i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }
        for(i=0;i<n;i++){
             System.out.println(arr[i]);
            }
        
    
        
    }
}