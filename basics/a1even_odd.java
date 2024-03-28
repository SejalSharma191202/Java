public class a1even_odd{
    public static void main(String[] args) {
        int n=4;
        boolean no=(n & 1)==1;
          System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
    }

public class OddEvenBitwise {

    public static void main(String[] args) {
        int number = 13; // Choose a number to test

        // Method 1: Using bitwise AND (&) to check LSB
        boolean isEvenMethod1 = (number & 1) == 0; // Creates a bit mask with only LSB set to 1
        System.out.println("The number is even (Method 1): " + isEvenMethod1);

        // Method 2: Using bitwise XOR (^)
        boolean isEvenMethod2 = (number ^ 1) == 0; // Directly XORs with 1
        System.out.println("The number is even (Method 2): " + isEvenMethod2);
    }
}
