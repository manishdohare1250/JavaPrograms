import java.util.*;
public class _71_multiplication_of_a_number_in_reverse_number {
    public static void main(String[] args) {
       Scanner k=new Scanner(System.in);
       System.out.println("enter a number:");
       int m= k.nextInt();
       System.out.println("Multiplication table  in reverse order for given number is :");
       for(int count=12;count>=1;count--){
           System.out.println(m+"*"+count+"="+(m*count));
       }
       k.close();

    }
}
