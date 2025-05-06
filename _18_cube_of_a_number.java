// write a program to find cube of a given number
import java.util.*;
public class _18_cube_of_a_number{
    public static void main(String[] args) {
        Scanner b =new Scanner(System.in);
        System.out.println("enter number:");
        double number =b.nextDouble();
        double cube=number*number*number;
        System.out.println("cube is:"+cube);
        b.close();
    }
    

}
   