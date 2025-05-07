// wap to reverse a number using print remainder
import java.util.*;
public class _067_do_while_loop_reverse_a_number {
    public static void main(String[] args) {
        Scanner k =new Scanner(System.in);
        System.out.print("enter a number :");
        int n =k.nextInt();
        int remainder;
        int count=n;
        System.out.println("Reverse of givenn number is:");
        do{
            remainder=count%10;
            System.out.print(remainder);
            count=count/10;
        }while(count>0);
        k.close();

    }
    
}
