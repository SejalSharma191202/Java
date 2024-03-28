public class a3_matrixsum {
    public static void main(String[] args) {

        //sum of array
        int arr[]={1,2,3,4,5,6,7,8,9};
        int i,sum=0;
        for(i=0;i<arr.length;i++){
          sum+=arr[i];
        }System.out.println(sum);

       //sum of two matrix or two 2d array
    int arr1[] []={{1,2,3},{2,3,4},{4,5,6}};
    int arr2[] []={{1,2,3},{2,3,4},{4,5,6}};
    int addn[][]=new int[arr1.length][arr2.length];
     
    for(i=0;i<arr1.length;i++){
        for(int j=0;j<arr2.length;j++){
         addn[i][j]=arr1[i][j]+arr2[i][j];
         System.out.print(addn[i][j]+"  ");
        }System.out.println();
    }  
     
    

        
        
   

    }
}
