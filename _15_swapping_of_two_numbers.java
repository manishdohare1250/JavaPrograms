// write a program to swap two numbers in java  
import java.util.*;
public class _15_swapping_of_two_numbers {
public static void main(String[] args){
    System.out.println("Enter first number:");
    Scanner sc=new Scanner(System.in);
    int  n1=sc.nextInt();
    System.out.println("Enter second number:");
    int  n2=sc.nextInt();
    int temp;
    temp=n1;
    n1=n2;
    n2=temp;
    System.out.println("swapping is done");
    System.out.println("n1 ="+n1+";\n n2="+n2 );
    sc.close();
    
}    

}
