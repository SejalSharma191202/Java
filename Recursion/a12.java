//last occurence

public class a12 {

    public static int findFirstOccurrence(int[] arr, int key, int inde) {
        if (inde == -1) { 
            return -1;
        }

        if (arr[inde] == key) { 
            return inde;
        }

        
        return findFirstOccurrence(arr, key, inde-1);// inde+1

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5};
        int key = 5;

        int firstIndex = findFirstOccurrence(arr, key, arr.length-1);//0
        
        
        if (firstIndex == -1) {
            System.out.println("not there");
        } else {
            System.out.println( firstIndex);
        }
    }
}


