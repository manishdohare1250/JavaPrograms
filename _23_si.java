import java.util.*;
public class _23_si {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter principle: ");
        float p=sc.nextFloat();
        System.out.println("enter rate: ");
        float r=sc.nextFloat();
        System.out.println("enter time: ");
        float t=sc.nextFloat();
        float si=p*r*t*1/100;
        System.out.println("si is= "+si);
    sc.close();}

}
