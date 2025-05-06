import java.util.*;
public class _025_farhenite_to_celsius {
    public static void main(String[] args) {

 Scanner sc=new Scanner(System.in);
     System.out.println("enter temprature in farhenite: ");
     float f=sc.nextFloat();
     float celsius=(f-32)*5/9;
     System.out.println("temprature in celsius is : "+celsius);

    sc.close();
    }
       
}
