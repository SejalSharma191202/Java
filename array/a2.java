public class  a2{
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{1,2,3},{1,2,3}};
        int i,j; 

       for(i=0;i<arr.length;i++){
        for(j=0;j<arr.length;j++){
        System.out.print(arr[i][j]+"  ");}
      System.out.println();}
      

      int[] age={1,2,3,4,5,6};
       //for each loop
       for(int ages:age)
          System.out.println(ages);  
          
          
        // for each for multi dim array
        int[][] myArray = {{1, 2, 3}, {4, 5}, {6, 7, 8}};

            // Outer loop iterates through rows
              for (int[] row : myArray) {

             // Inner loop iterates through elements in each row
                  for (int element : row) {
              System.out.print(element + " ");
                                   }
              System.out.println(); // Move to next line after each row
                }
  

    } 
}
//3d array is also possible