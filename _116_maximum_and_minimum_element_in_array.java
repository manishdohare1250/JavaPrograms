import java.util.*;
public class _116_maximum_and_minimum_element_in_array {
    public static void main(String[] args) {
        Scanner sd=new Scanner (System.in);
        int array[]=ArrayUtil.getArrayFromUser();
        ArrayUtil.printArray(array);
        System.out.println();
        int  min=min(array);
        int max=max(array);
        System.out.println("Minimum element of array is: "+min);
        System.out.println("Maximum element of array is: "+max);
        sd.close();
    }
    public static int max(int array[]){
        int max=Integer.MIN_VALUE;
        int i=0;
        while(i<array.length){
            if(max<array[i]){
                max=array[i];

            }i++;
        }
        return max;
    }
    public static int min(int array[]){
        int min=Integer.MAX_VALUE;
        int i=0;
        while(i<array.length){
            if(min>array[i]){
                min=array[i];

            }i++;
        }

        return min;
    }
}
