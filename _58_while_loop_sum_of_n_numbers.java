// wap to find sum of  first n naturals numbers
import java.util.*;
public class _58_while_loop_sum_of_n_numbers {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("enter value of n :");
        int n=k.nextInt();
        int counter=1;
        int sum=0;
        while(counter<=n){
            sum=sum+counter;
            counter++;
        }
        System.out.println("Sum of first "+n + " Natural numbers is :"+ sum);
        k.close();
    }
    
}
