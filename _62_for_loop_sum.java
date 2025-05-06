// wap to print sum of first 10 natural numbers
import java.util.*;
public class _62_for_loop_sum {
    public static void main(String[] args) {
        Scanner m =new Scanner(System.in);
        System.out.println("enter value of n:");
        int n=m.nextInt();
        int sum=0;
        for(int count=1;count<=n;count++){
           sum=sum+count;
        }
        System.out.println("sum of first n natural numbers is" +sum);
        m.close(); 
     }
}
    
    

