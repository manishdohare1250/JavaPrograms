// product of two numbers by user input
import java.util.*;
public class _14_product_of_two_numbers {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        
        System.out.println("enter first number: ");
        int n1=p.nextInt();

        System.out.println("enter second number: ");
        int n2=p.nextInt();

        int product=n1*n2;
        System.out.println("Product of "+n1+" and "+n2+" is = " +product);
        p.close();
    }
    
}
