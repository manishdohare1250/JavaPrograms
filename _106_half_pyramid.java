
// wap to print a java program
import java.util.*;

public class _106_half_pyramid {

    // .half pyramid--
    // *
    // **
    // ***
    // ****
    // *****
    // ******
    /// function 1
    public static void half_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");//// we can use sout("*"+" ") for space bw asterisk in patterns
            }
            System.out.println();
        }
    }

    /// function2
    public static void half_pyramid2(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");// we can use sout("*"+" ") for space bw asterisk in patterns
            }
            System.out.println();
        }

    }

    // reverse .half pyramid--
    // ******
    // *****
    // ****
    // ***
    // **
    // *

    /// function 3
    public static void reverse_half_pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*"); // we can use sout("*"+" ") for space bw asterisk in patterns
            }
            System.out.println();
        }
    }

    /// function4
    public static void reverse_half_pyramid2(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // we can use sout("*"+" ") for space bw asterisk in patterns
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter your number :");
        int n = k.nextInt();
        System.out.println("o/p of function 1");
        half_pyramid(n);
        System.out.println("o/p of function 2");
        half_pyramid2(n);
        System.out.println("o/p of function 3");
        reverse_half_pyramid(n);
        System.out.println("o/p of function 4");
        reverse_half_pyramid2(n);
        k.close();

    }
}
