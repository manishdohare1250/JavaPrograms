import java.util.*;  // create a program to finds number of occurance of  an element of array
public class _115_number_of_occurences_in_array {
public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int array[]=ArrayUtil.getArrayFromUser();
    ArrayUtil.printArray(array);
    System.out.println();
    System.out.println("Enter element for which you want to find the no.of occurance: ");
    int n=sc.nextInt();
    int result=no_of_occurance(array, n);
    System.out.println("No. of occurance of element which you entered is:  "+result);
    sc.close();

}   
 public static int no_of_occurance(int array[],int n){
    int sum=0;
    int i=0;
    while(i<array.length){
        if(n==array[i]){
           sum++;
           
        }i++;
    }
   return  sum;
}


}
