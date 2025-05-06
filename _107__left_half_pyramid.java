import java.util.*;

public class _107__left_half_pyramid {
    /*
     * wap to print left half pyramid and reverse of it
     * // _ _ _ _ _ *
     * // _ _ _ _ * *
     * // _ _ _ * * *
     * // _ _ * * * *
     * // _ * * * * *
     * // * * * * * *
     */

    // function 1
    public static void left_half_pyramid(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // function 2

    public static void left_half_pyramid2(int n) {

        for (int i = n; i >= 1; i--) {
            for (int j = n - 1; j >= n - i + 1; j--) {
                System.out.print("_");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // reverse left half pyramid

    // * * * * * *
    // _ * * * * *
    // _ _ * * * *
    // _ _ _ * * *
    // _ _ _ _ * *
    // _ _ _ _ _ *
    // function 3
    public static void reverse_left_half_pyramid(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print("_");
            }
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // function 4

    public static void reverse_left_half_pyramid2(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = n - 1; j >= n - i + 1; j--) {
                System.out.print("_");
            }
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = k.nextInt();
        System.out.println("o/p of function 1 is:");
        left_half_pyramid(n);
        System.out.println("o/p of function 2 is:");
        left_half_pyramid2(n);
        System.out.println("o/p of function 3 is:");
        reverse_left_half_pyramid(n);
        System.out.println("o/p of function 4 is:");
        reverse_left_half_pyramid2(n);
        k.close();

    }

}
