import java.util.*;
public class _022_area_of_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter base : ");
        float n1=sc.nextFloat();
        System.out.println("enter height: ");
        float n2=sc.nextFloat();
        float area=(n1*n2)*1/2;
        System.out.println("area is: "+area);
        sc.close();
    }
}
