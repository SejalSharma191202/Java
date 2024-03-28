//print decreasing and increasing recursively

public class a2 {
    public static void pd(int n){
          if(n>0){
          
            System.out.print(n+" ");
            pd(n-1); 

          }
          
   
  }
  

        public static void main(String[] args) {
        int n=5;
        //int k=1;
          pd(n);
         
        
    }
  

    }

