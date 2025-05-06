 import java.util.*;
 public  class _117_check_array_is_sorted_or_not {
    public static void main(String[] args) {
        Scanner sd=new Scanner (System.in);
        int array[]=ArrayUtil.getArrayFromUser();
        ArrayUtil.printArray(array);
        System.out.println();
        boolean isinc=isincreasing(array);
        boolean isdec=isdecreasing(array);
        if(isinc || isdec){
            System.out.println("your array is sorted");
        }else{
            System.out.println("your array is not sorted");
        }
        sd.close();
    } 
    public static boolean isincreasing(int array[]){
       int i=1;
       while(i<array.length){
        if(array[i]<array[i-1]){
            return false;
        }i++;
       }
        return true;
    }
    public static boolean isdecreasing(int array[]){
       int i=1;
       while(i<array.length){
        if(array[i]>array[i-1]){
            return false;
        }
       }
        return true;
    }

}
