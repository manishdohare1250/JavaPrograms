// multiplication tableof a number
import java .util.*;
public class _70_multiplication_of_a_number {
    public static void main(String[] args) {
        Scanner j=new Scanner(System.in);
        System.out.println("enter a number:");
        int n =j.nextInt();
        System.out.println("Multiplication table for given number is :");
        for(int count=1;count<=12;count++){
            System.out.println(n+"*"+count+"="+(n*count));
        }
        j.close();
        
    }
    
}
