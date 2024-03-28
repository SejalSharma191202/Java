//all occurence

import java.util.*;
class a13_1{

    public static void main(String arg[]){
        int b,i;
        i = 0;
        Scanner scan = new Scanner(System.in);
        int a[] = {1,1,2,4,4,5,5};
        System.out.println("Enter Target :");
        b = scan.nextInt();
        firstOccur(a,b,i);
    }

    public static void firstOccur(int a[],int target,int i){
        ArrayList occur = new ArrayList<>(); 
        if(a[i] == target){
            System.out.println("Output : "+i);
            occur.add(i);
            firstOccur(a,target,i+1);
        }
        else{
            firstOccur(a,target,i+1);
        }
       }

}
