// wap to find factorial of a number using functions
import java.util.*;
public class _084_fact_of_number_using_functions {
    public static void main(String[] args) {
         Scanner k=new Scanner(System.in);
         System.out.println("enter a number for which you want to calculate factorial:");
         int n=k.nextInt();
         int fact=factorial(n);
         System.out.println("factorial of a given number is:"+fact);
         k.close();
    }
    public static  int factorial(int n){
       int fact=1;
        for(int count=1;count<=n;count++){
            fact=fact*count;
        }
      return fact;
    }
    
}
