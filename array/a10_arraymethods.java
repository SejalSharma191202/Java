
// While Java doesn't have a dedicated Array class, it offers two primary ways to work with arrays:

// 1. Arrays class (java.util.Arrays):

// Static class providing utility methods for array manipulation.
// Key methods:
// asList(T... a): Returns a List view of the specified array.
// binarySearch(T[] a, T key): Searches for the specified key in the array using the binary search algorithm.
// copyOf(T[] original, int newLength): Copies the specified array, truncating or padding with zeros to obtain the desired length.
// deepEquals(Object[] a1, Object[] a2): Returns true if the two specified arrays are deeply equal.
// equals(Object[] a1, Object[] a2): Returns true if the two specified arrays are equal.
// fill(T[] a, T value): Fills all elements of the specified array with the specified value.
// sort(T[] a): Sorts the specified array into ascending order.
// toString(T[] a): Returns a string representation of the contents of the specified array.
// 2. Array class (java.lang.reflect.Array):

// Provides dynamic creation and access to arrays of any component type.
// Key methods:
// newInstance(Class<?> componentType, int length): Creates a new array with the specified component type and length.
// get(Object array, int index): Returns the value of the component at the specified index in the array.
// set(Object array, int index, Object value): Sets the value of the component at the specified index in the array to the specified value.
// Remember:

// Arrays class is generally preferred for common array operations.
// Array class is useful for dynamic array creation and reflection-based access.
// Choose the appropriate methods based on your specific needs and the level of control required for array manipulation.


// 1.Arrays.copyOf(arr,arr.length) 2.Arrays.copyOfRange(arr,0,arr.length)

import java.util.*;
public class a10_arraymethods{
     
static Scanner sc=new Scanner(System.in);

    public static void printarr(int[]arr){
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }


   
    public static void main(String[] args) {
        int[] arr=new int[5];
        int[] arr2=new int[5];

        for(int i=0;i<arr.length;i++)
       {
        arr[i]=sc.nextInt();
       }

       //int [] arr2=arr;
        arr2=Arrays.copyOf(arr,arr.length);//arrname,length (jaha tk copy krna h)
        arr2=Arrays.copyOfRange(arr,0,arr.length); //arrname,intial length(inclusive),arrlength(exclusive)


        System.out.println("or");
       printarr(arr);

       System.out.println("cop");
       printarr(arr2);
        

       //changing copied array
       arr2[0]=0;
       arr2[1]=0;

       System.out.println("or after chnge");
       printarr(arr);    //humne changes  sirf arr2 me ki thi wo arr me nahi only possible beoz of arr.clone()

       System.out.println("cop  after chn");
       printarr(arr2);

    }
}

