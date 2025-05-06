import java.util.*;
public class _037_Bitwise_OR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1=sc.nextInt();
        System.out.println("Enter second number: ");
        int n2=sc.nextInt();
        int  result=n1|n2;
        System.out.println("Bitwise OR of numbers is: "+result);sc.close();
    }
}
