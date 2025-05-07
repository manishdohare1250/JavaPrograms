import java.util.*;
public class _059_while_loop_factorial {
    public static void main(String[] args) {
        Scanner k =new Scanner(System.in);
        System.out.println("enter number:");
        // int n=k.nextInt();
        // int count=1;;
        // int fact=1;//
        // while (count<=n)
        //    {
        //      fact=fact*count;
        //      count++;
        //      }
        int n=k.nextInt();
        int count=n-1;
        int fact=n;
        while (count>0)
           {
             fact=fact*count;
             count--;
             }
       System.out.println("factorial for given number is:"+ fact);
       k.close();

        
    }
}
