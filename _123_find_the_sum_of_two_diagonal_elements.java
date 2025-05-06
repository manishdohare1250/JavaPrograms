 import java.util.*;
 public class _123_find_the_sum_of_two_diagonal_elements {
 public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    int [][] arra=Arr_2D_Utility.getarray();
    Arr_2D_Utility.printarr(arra);
    System.out.println();
    long sum=diagonalSum(arra);
    System.out.println("sum of Diagonal is: "+sum);
    sc.close();
 }   
 public static long diagonalSum(int array[][]){
    long leftsum=sumofleftdiagonal(array);
    long rightsum=sumofrightdiagonal(array);
    long sum=leftsum+rightsum;
    if (array.length%2!=0) {
        int ind=array.length/2;
        sum=sum-array[ind][ind];
    }
    
    return sum;
 }
 public static long sumofleftdiagonal(int [][]array){
   long sum=0;
   int i=0;
   while (i<array.length) {
    sum=sum+array[i][i];
    i++;
   }
    return sum;
 }
 public static long sumofrightdiagonal(int [][]array){
    long sum=0;
    int i=0;
    while (i<array.length) {
        int col=array.length-1-i;
        sum=sum+array[i][col];
        i++;
    }
    return sum;
 }
}
