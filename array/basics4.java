import java.util.Scanner;
void reverse(int[] nums,int i,int j){  
    while(i<j){
        swap(nums,i,j);
        i++;
        j--;
    }
}
void swap(int[] nums,int i,int j){   
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}
class basics4{

    public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
      int k=sc.nextInt();

      int nums[]=new int[10];
      for(int i=0;i<nums.length;i++){
        nums[i]=sc.nextInt();
      }
      
        k = k % nums.length;
        reverse(nums,0,nums.length-1);  
        reverse(nums,0,k-1);   
        reverse(nums,k,nums.length-1);   
    }}
  
