import java.util.*;
public class _041_Right_shift {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1=sc.nextInt();
        
        int  result=n1>>1;
        System.out.println("Bitwise right shift of numbers is: "+result);sc.close();
    }

}
