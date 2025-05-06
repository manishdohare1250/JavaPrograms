 import java.util.*;
 public class _118_return_a_new_array_deleting_a_specific_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int array[]=ArrayUtil.getArrayFromUser();
        ArrayUtil.printArray(array);
        System.out.println();
        System.out.println("Enter no.you want to delete: ");
        int numToDelete=sc.nextInt();
        int[]newArr=deleteNumber(array, numToDelete);
        System.out.println("Here is Your new Array");
        ArrayUtil.printArray(newArr);
        sc.close();
    }
    public static int[]deleteNumber(int[]numArr,int numtodelete){
    int occ=_115_number_of_occurences_in_array.no_of_occurance(numArr,numtodelete);
     int newSize=numArr.length-occ;
     int newArr[]=new int[newSize];
    
     int i=0; int j=0;
     while(i<numArr.length){
        if(numArr[i]!=numtodelete){
            newArr[j]=numArr[i];
            j++;
        }i++;
     }
     return newArr;
    }
}
