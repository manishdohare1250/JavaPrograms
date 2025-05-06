import java.util.*;

public class _120_merge_two_sorted_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to merging of sorted array");
        int[] arr1 = ArrayUtil.getArrayFromUser();
        ArrayUtil.printArray(arr1);
        System.out.println();
        int[] arr2 = ArrayUtil.getArrayFromUser();
        ArrayUtil.printArray(arr2);
        System.out.println();
        int[] mergedArr = merge(arr1, arr2);
        System.out.println("Your merged array is: ");
        ArrayUtil.printArray(mergedArr);
        sc.close();
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int newSize = arr1.length + arr2.length;
        int newArr[] = new int[newSize];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length || j < arr2.length) {
            if (j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])) {
                newArr[k] = arr1[i];
                i++;
                k++;
            }else{
                newArr[k]=arr2[j];
                k++;
                j++;
            }

        }
        return newArr;
    }

}
