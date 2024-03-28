import java.util.*;

public class a8_arrayreference2 {
    static void change_array(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=0;
        }
    }

    public static void changeVal(int a){
        a=1034;
        //return a;
    }

    public static void printArray(int[]arr){
        for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]+"  ");
        }
    }

    public static void main(String[] args){
          int a=5;
        //  System.out.println(changeVal(a));   1034 for int return type
          System.out.println(a);  // pass by value.. a pass nahi hu aa ki copy pass hua h

        int [] arr=new int[3];
        arr[0]=5;
        arr[1]=6;
        arr[2]=7;

        change_array(arr);

        printArray(arr);
    }
}
// a nahi change hua kyu ki uski prim dt hai copy stack me bnti hai
// arr change hu aki uski copy heap me bnti hai or uska refer var rehta hai jo ki stack me rehtaa h