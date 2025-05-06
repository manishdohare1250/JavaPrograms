// average of 3 numbers  from user input
import java.util.*;
public class _19_Average_of_3_numbers {
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);
        System.out.println("enter first number:");
        float n1=k.nextFloat();
        System.out.println("enter second number:");
        float n2=k.nextFloat();
        System.out.println("enter third number:");
        float n3=k.nextFloat();
        float average=(n1+n2+n3)/3;
        System.out.println("average is:"+average);
        k.close();
        

    }
    
}
