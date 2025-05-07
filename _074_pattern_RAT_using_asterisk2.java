// wap to print right angle triangle using asterisk
import java.util.*;
public class _074_pattern_RAT_using_asterisk2 {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=k.nextInt();
        System.out.println("Your pattern is here:");
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        k.close();

        
    }
}


