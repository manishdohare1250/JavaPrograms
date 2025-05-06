import java .util.Scanner;
public class _114_sum_and_average_of_array_elements {
    public static void main(String[] args) {
        Scanner kg=new Scanner (System.in);
        System.out.println("Enter size of  your array: ");
        int n=kg.nextInt();
        int array[]=new int[n];
        System.out.println("Enter elements of your array: ");
        int i=0; int j=i;
        while(i<n){
            array[i]=kg.nextInt();
            i++;
        }

        System.out.println("Your array is : ");
        while(j<n){
            System.out.print(array[j]+" ");
            j++;
        }
        System.out.println();
        int sum=sum(array);
        int average=average(array);
        System.out.println("Sum of all elements of your array is:"+sum);
        System.out.println("Average of all elements of your array is:"+average);
        kg.close();
    }
    public static int sum(int array[]){   // method to find sum
         int sum=0;
         int i=0;
         while(i<array.length){
            sum=sum+array[i];
            i++;
         }
        return sum;
    }
    public static int average(int array[]){ /// method to find average
        int average=sum(array)/array.length;
        return average;
    }
}
