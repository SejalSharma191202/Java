import java.util.Scanner;
public class basics1{
    public static void main(String[] args) {
        int [][] arr= new int[3][4];
        arr[1][2]=10;
        System.err.println(arr[1][2]);
        int i,j;
        

        System.out.println(arr.length);//3
        System.out.println(arr[0].length);//4
        System.out.println(arr[1].length);  //4    we'll learn in memry

        //printing rowise
        for(i=0;i<arr.length;i++){
            for(j=0;j<arr[0].length;j++){    //for column
              System.out.print(arr[i][j]+"   ");
            }System.out.println();
        }

     
          System.out.println();
          System.out.println();


          //printing columnwise
          for(i=0;i<arr[0].length;i++){
            for(j=0;j<arr.length;j++){    //for column
              System.out.print(arr[j][i]+"   ");
            }System.out.println();
          }
           System.out.println( );

            //print values          1 2 3
                                //  4 5 6
                                //  7 8 9

                                Scanner sc= new Scanner(System.in);
                                for(i=0;i<arr.length;i++){
                                    for(j=0;j<arr[0].length;j++){    //for row
                                      arr[i][j]=sc.nextInt();
                                    }System.out.println();
                                  }
                                   System.out.println( );
                        
                                for(i=0;i<arr.length;i++){
                                    for(j=0;j<arr[0].length;j++){    //for row
                                      System.out.print(arr[i][j]+"   ");
                                    }System.out.println();
                                  }
                                   System.out.println( );
                        
                                   for(i=0;i<arr[0].length;i++){
                                    for(j=0;j<arr.length;j++){    //for column
                                      System.out.print(arr[j][i]+"   ");
                                    }System.out.println();
                                  }
                                   System.out.println( );

                                   System.out.println( );

                                   for(j=0;j<arr.length;j++){
                                    for(i=0;i<arr[0].length;i++){    //for column
                                      System.out.print(arr[j][i]+"   ");
                                    }System.out.println();
                                  }
                                   System.out.println( );






                        

      


        
    }
}