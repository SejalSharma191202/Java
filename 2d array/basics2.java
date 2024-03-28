//wave traversal
/*
 *     1 2 3 4 
 *     5 6 7 8
 *     9 10 11 12
 * 
 * 
 */

import java.util.Scanner;

public class basics2 {
    
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         int [][] arr= new int[3][4];
         int i,j;
                                for(i=0;i<arr.length;i++){
                                    for(j=0;j<arr[0].length;j++){    //for input
                                      arr[i][j]=sc.nextInt();
                                    }System.out.println();
                                  }
                                
//output
                                   for(j=0;j<arr[0].length;j++){
                                       if(j%2!=0)  {   //odd
                                        for(i=arr.length-1;i>=0;i--)
                                        {
                                            System.out.print(arr[i][j]+" ");
                                             if(i==0){
                                                 break;}
                                            System.out.println();
                                            
                                        }}
                                              //even
                                 else{ for(i=0;i<arr.length;i++){
                                     System.out.print(arr[i][j]+" ");
                                     if(i==arr.length-1){
                                     break;}
                                      System.out.println();
                                    }}
                                  
                                
    }
}
}
