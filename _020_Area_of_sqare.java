// area of sqare
import java.util.Scanner;
public class _020_Area_of_sqare {
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);
        System.out.println("enter side of sqare:");
        float side=k.nextFloat();
        float area=side*side;
        System.out.println(area);
        k.close();
    }
    
}
