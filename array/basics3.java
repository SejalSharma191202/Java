//rotation 
import java.util.Scanner;
public class basics3 {
        public static void main(String arg[]){
            Scanner scan = new Scanner(System.in);
            int a[] = new int[5];
            int i,j;
            int k=0;
            System.out.println("Enter 5 Integers :");
            for(i = 0;i<a.length;i++){

                a[i] = scan.nextInt();
            }
            System.out.println("\nPrinting array :");
            for(i = 0;i<a.length;i++){

                System.out.printf("a[%d] = %d\n",i,a[i]);
            }
            System.out.println("\nPrinting reversed array :");
            for(i = a.length-1;i>=0;i--){

                System.out.printf("a[%d] = %d\n",i,a[i]);
            }
            
            System.out.println("Enter no of rotation");
            int p = scan.nextInt();
            System.out.println("");
            j = a.length-p;
            for(i=j;i<a.length;i++){
                System.out.println(a[i]);
            }
            for(i=0;i<j;i++){
                System.out.println(a[i]);
            }

           
}
}
