import java.util.Scanner;
public class ArrayUtil {

    // Method to take array input from the user
    public static int[] getArrayFromUser() {
        Scanner kg = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = kg.nextInt();
        int array[] = new int[n];

        // Taking input for the array elements
        System.out.println("Enter values of array: ");
        int i = 0;
        while (i < n) {
            array[i] = kg.nextInt();
            i++;
        }
          
        return array;
    }

    // Method to print the array
    public static void printArray(int[] array) {
        System.out.println("Your array is: ");
        int j = 0;
        while (j < array.length) {
            System.out.print(array[j]+" ");
            j++;
        }
    }

    // Method to calculate and return the sum of the array elements
    public static int getSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    // Method to calculate and return the average of the array elements
    public static double getAverage(int[] array) {
        if (array.length == 0) return 0; // Avoid division by zero
        return (double) getSum(array) / array.length;
    }
}


