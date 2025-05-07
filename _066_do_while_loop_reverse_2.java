// wap to print reverse of a number
import java.util.*;
public class _066_do_while_loop_reverse_2 {
    public static void main(String[] args) {
        Scanner k =new Scanner(System.in);
        System.out.println("enter a number:");
        int n=k.nextInt();
        int reverse=0;
        int count=n;
        int remainder;
        do{
            remainder=count%10;
            reverse=reverse*10+remainder;
            count=count/10;
        } while(count>0);
        System.out.println("reverse of a given numbber is:"+reverse);
        k.close();

    }
}
