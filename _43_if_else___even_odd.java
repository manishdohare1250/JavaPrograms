// conditional sttement-----if-else statements
// check a number is even or odd
import java.util.*;
public class _43_if_else___even_odd {
    public static void main(String[] args) {
    Scanner k=new Scanner(System.in);   
    System.out.println("enter number :");
    int n=k.nextInt();
    
     if (n%2==0) {System.out.println(n +" is even");
        
    } else{
        System.out.println(n + " is odd");
    }
    k.close();
    }
    
}
