// wap to print right angle triangle using asterisk
import java.util.*;
public class _73_pattern_like_Right_angle_triangle_using_asterisk_in {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=k.nextInt();
        System.out.println("Your pattern is here:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        k.close();

        
    }
}
