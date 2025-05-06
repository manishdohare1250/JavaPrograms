import java.util.*;
public class _102_average_of_three_numbers {
    public static float Average(float a,float b,float c){
    float avg=(a+b+c)/3;
     return avg;
    }
    public static void main(String[] args) {
       Scanner k=new Scanner (System.in);
       System.out.println("enter your first number:");
       float a=k.nextFloat();
       System.out.println("enter your second number:");
       float b=k.nextFloat();
       System.out.println("enter your third number:");
       float c=k.nextFloat();
       

        float average=Average(a, b, c);
        System.out.println(" The Average for given numbers is:"+average);
        k.close();
    }
}
