 /* Arithmatic operation by taking user input*/
 import java.util.*;
public class _32_arithmatic_operations {
    public static void main(String[]args){
        System.out.println("Enter first number:");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        System.out.println("Enter Second number:");
        int n2=sc.nextInt();
        System.out.println("sum:"+(n1+n2));
        System.out.println("sub:"+(n1-n2));
        System.out.println("mul:"+(n1*n2));
        System.out.println("div:"+(n1/n2));
        System.out.println("mod:"+(n1%n2));
        sc.close();

    }
}
