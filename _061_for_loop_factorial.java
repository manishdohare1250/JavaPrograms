// factoriual of a number
import java.util.*;
public class _061_for_loop_factorial {
    public static void main(String[] args) {
       Scanner j=new Scanner(System.in);
       System.out.println("enter number :");
       int n=j.nextInt();
       int fact =1;
       for(int count=1;count<=n;count++){
        fact=fact*count;
       }
        System.out.println(fact);
        j.close();
        
    }
}
