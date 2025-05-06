import java.util.*;
public class _024_compound_interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter principle: ");
        float p=sc.nextFloat();
        System.out.println("enter rate: ");
        float r=sc.nextFloat();
        System.out.println("enter time: ");
        float t=sc.nextFloat();
        double Ci=p*Math.pow((1+r/100),(t));
        System.out.println("your ci is: "+Ci);
        sc.close();
    }
}
