//sliding window

public class basics5 {
   public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8,9};
    int k=3;
    int i,j;
    int max=-1;
    for(i=0;i<=arr.length-k;i++){
      int sum=0;
      for(j=0+i;i<k+i;j++){
        sum+=arr[j];
      }
      if(sum>max) max=sum;
    } System.out.println(max);
}
}
