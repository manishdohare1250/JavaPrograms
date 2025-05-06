//  sum of first n even and odd numbers
 import java.util.*;
 public class _69_sum_of_first_n_even_and_odd_numbers {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.print("enter how many number  you want to add :");
        int n=k.nextInt();
        int evensum=0;
        int oddsum=0;
        System.out.println("Even numbers:");
        for(int start1=2; start1<=2*n;start1+=2){
              System.out.print(start1+" ");
             evensum=evensum+start1;
        }
        System.out.println("\nOdd numbers:");
        for(int start2=1; start2<2*n;start2+=2){
            System.out.print(start2+" ");
            oddsum=oddsum+start2;
        }
        System.out.print("\nSum of first "+n+(" even number is :"+evensum));
        System.out.print("\nSum of first "+n+(" odd number is :"+oddsum));
           k.close(); 
    }
}
