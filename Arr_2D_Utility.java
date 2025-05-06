//  utility class
import java.util.*;
 public class Arr_2D_Utility{
    public static int [][] getarray() {  // method to take  2D array as input
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array for rows: ");
        int  rows=sc.nextInt();
        System.out.println("Enter size of array for coloumns: ");
        int cols=sc.nextInt();
        int array [][]=new int [rows][cols];
        System.out.println("enter elements for your array: ");
        int i=0; 
        while(i<rows){
            int j=0;
            while(j<cols){
                array[i][j]=sc.nextInt();
                j++;
            }i++;
        }
        
        return array;
        
       

    }
    public static void printarr(int arr[][]){///method to print 2D array
        System.out.println("your array: ");
        int k=0; 
        while(k<arr.length){
            int j=0;
            while(j<arr[0].length){
               System.out.print(arr[k][j]+" ");
                j++;
            }System.out.println();
            k++;
        }
    }
    
}
