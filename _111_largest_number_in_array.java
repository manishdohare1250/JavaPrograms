public class _111_largest_number_in_array {
    // function 1----
    // find the largest number in given array
    public static int largest_number(int array[]) {
        int largest = array[0];// int largest=Integer.MIN_VALUE;------(- infinity)
        for (int i = 0; i < array.length; i++) {
            if (largest < array[i]) {
                largest = array[i];
            }
        }
        return largest;

    }

    // function 2----
    // find the smallest number in given array
    public static int smallest_number(int array[]) {
        int smallest = array[0];// int smallest=Integer.MAX_VALUE;----(+infinity)
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;

    }

    public static void main(String[] args) {
        int array[] = { 9, 5, 10, 6, 5, 8, 11, 4, 13 };
        int result = largest_number(array);
        int result2 = smallest_number(array);
        System.out.println("largest number for given array is:" + result);
        System.out.println("smallest number for given array is:" + result2);

    }
}
