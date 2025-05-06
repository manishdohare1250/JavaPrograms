import java.util.*;
public class _39_Bitwise_complement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1=sc.nextInt();
       
        int  result=~n1;
        System.out.println("Bitwise complement of numbers is: "+result);sc.close();
    }

}
