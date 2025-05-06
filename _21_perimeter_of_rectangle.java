 import java.util.*;
 public class _21_perimeter_of_rectangle {
 public static void main(String[] args) {
    Scanner jk=new Scanner(System.in);
    System.out.println("Enter first side of rectangle: ");
    double a=jk.nextDouble();
    System.out.println("Enter second side of rectangle: ");
    double b=jk.nextDouble();
    System.out.println("Enter third side of rectangle: ");
    double c=jk.nextDouble();
    System.out.println("Enter fourth side of rectangle: ");
    double d=jk.nextDouble();
    double p=a+b+c+d;
    System.out.println("perimeter of rectangle is: "+p);
    jk.close();
 }   
}
