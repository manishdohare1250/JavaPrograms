import java.util.*;
 public class _122_Find_sum_and_average_of_all_elements_in_2D_array {
public static void main(String[] args) {
    Scanner gb=new Scanner(System.in);
    int [][] arr=Arr_2D_Utility.getarray();
    Arr_2D_Utility.printarr(arr);
    System.out.println();
    long Sum=sum(arr);
    double Average=average(arr);
    System.out.println("Sum of all the elements of your array is :"+Sum);
    System.out.println("Average of all the elements of your array is :"+Average);
    gb.close();
}   
 public static long sum(int array[][]){
   int i=0;
   long sum=0;
   while(i<array.length){
    int j=0;
    while (j<array[i].length) {
        sum=sum+array[i][j];
        j++;
    }i++;
   }

    return sum;
}
public static double average(int array[][]){
    if(array.length==0){
        return 0;
    }
    int rows=array.length;
    int cols=array[0].length;
    double size=rows*cols;
    return sum(array)/size;
}

}
