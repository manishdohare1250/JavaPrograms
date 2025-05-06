//  else if  statment--- check wheather  a number is even ,odd or zero
 import java.util.*;
public class _45_Else_if {
    public static void main(String[] args) {
    Scanner k=new Scanner(System.in);   
    System.out.println("enter number :");
    int n=k.nextInt();
    if(n==0){
        System.out.println("number is zero");
    } else if (n%2==0) {System.out.println(n +" is even");
        
    } else{
        System.out.println(n + " is odd");
    }
    k.close();
    }
}
