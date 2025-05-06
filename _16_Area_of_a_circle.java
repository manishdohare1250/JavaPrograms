// area of a circle by taking radius as input
import java.util.*;
public class _16_Area_of_a_circle {
    public static void main(String[] args) {
        Scanner k= new Scanner (System.in);
        System.out.println("enter radius of a circle:");
        float radius=k.nextFloat();
        float area=3.14f *radius*radius;
        System.out.println("Area of a circle for radius = " +radius+" will be = "+area);
        k.close();
        //  
    }
    
}
