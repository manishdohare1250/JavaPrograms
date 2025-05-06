// addition of two numbers with user input
import java.util.*;
public class _13_Addiition_of_2_numbers_using_user_input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum;
        sum=a+b;
        System.out.println(sum);
        sc.close();
        

        Scanner gc=new Scanner(System.in);
        int m=gc.nextInt();
        int n=gc.nextInt();
        int Sum;
        Sum=m+n;
        System.out.println("Sum of m and n is:"+Sum);
        gc.close();
        


        Scanner vc=new Scanner(System.in);
        System.out.println("enter first number:");
        int c=vc.nextInt();
        System.out.println("enter  second number:");
        int d=vc.nextInt();
        int addition;
        addition=c+d;
        System.out.println("addition of " + c + " and " + d + " is = " +addition);
        vc.close();

        
    }
    
}
