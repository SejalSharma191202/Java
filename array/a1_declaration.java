/*
 int age;    int[] age; or int age[] ;

 array syntax

 int[] ages= new int[5];

 OR

 int ages[];
 ages= new int[5];


 array literal //bina size define kiye array bnaskte
  int[] intArray = {1,2,3,4,5}

 memory allocation:
   
 1. stack: primitive dt,refernce,fn
 2. heap: object
   
 eg: 

 */


public class a1_declaration{
    public static void main(String[] args) {
        int ages[]=new int[5];
        String[] names={"rahul","raj","aradhya"};

        ages[0]=12;
        ages[1]=12;
        ages[2]=12;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);


        System.out.println();


        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);





        
    }
}