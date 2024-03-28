// max recursion 1
import java.util.*;
public class a10 {

    public static int findMax(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            
            return arr[idx];
        }
   
    
        int max= findMax(arr, idx + 1);
        return Math.max(arr[idx], max);
    }

    public static void main(String[] args) {
        int[] arr =  {1,5,3,4};
        int max = findMax(arr, 0);
        System.out.println(max);
    }
}

      