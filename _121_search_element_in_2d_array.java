import java.util.Scanner;

public class _121_search_element_in_2d_array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int array[][]=Arr_2D_Utility.getarray();
        Arr_2D_Utility.printarr(array);
        System.out.print("enter Element you want to search in array: ");
        int number = sc.nextInt();
        boolean result = search(array, number);
        if (result) {
            System.out.println("your number was found");
        } else {
            System.out.println("your number was not found");
        }
    sc.close();
    }


    public static boolean search(int arr[][], int num) {
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                if (arr[i][j] == num) {
                    return true;
                }
                j++;
            }
            i++;
        }

        return false;
    }
}
