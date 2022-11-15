import java.util.*;
public class insertionSorting {

    /**
     * insertion sorting in java
     * 2 arrays to 
     * 1 sorted and another not sorted
     */
    public static void main(String[] args ) {
      

        /* Generating random integers */

        Random rand = new Random();
        int [] numbers = new int[1000];

        for (int i = 0; i < numbers.length; i++ ) {
            numbers[i] = rand.nextInt(10000);
        }


        System.out.println("Before sorting: ");
        printArray(numbers);

        insertionSort(numbers);

        System.out.println("\nAfter sorting: ");
        printArray(numbers);
    }

    /**
     * @param 
     * sorting the array
     */
    private static void insertionSort(int[] inputArray) {

        for ( int i = 1; i < inputArray.length; i++) {
            int currentValue = inputArray[i];

            int j = i - 1;

            while (j >= 0 && inputArray[j] > currentValue) {
                inputArray[j + 1] = inputArray[j];
                j--;
            }

            inputArray[j + 1] = currentValue;

        }

    }

    /**
     * @param numbers
     * printing the sorted arrays function
     */
    private static void printArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        
    }

    

}