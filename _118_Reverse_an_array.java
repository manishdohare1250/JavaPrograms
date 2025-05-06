 import java.util.*;
 public class _118_Reverse_an_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("welcome to array reversal: ");
        int []numArr=ArrayUtil.getArrayFromUser();
        ArrayUtil.printArray(numArr);
        reverse(numArr);
        System.out.println("Your reversed array is : ");
        ArrayUtil.printArray(numArr);
        sc.close();

    }
    public static void  reverse(int []arr){
        int i=0;
        while(i<arr.length/2){
            int swap=arr[i];
            arr[i]=arr[(arr.length-1)-i];
            arr[(arr.length-1)-i]=swap;
            i++;
        }

    }
}
