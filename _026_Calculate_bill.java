// calculate bill
import java.util.*;
public class _026_Calculate_bill {
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);
        System.out.println("enter cost of pencil:");
        float pencil=k.nextFloat();
        System.out.println("enter cost of pen:");
        float pen=k.nextFloat();
        System.out.println("enter cost of eraser:");
        float eraser=k.nextFloat();
        float bill=(pencil+pen+eraser);
        float Bill=bill+(0.18f*bill);
        System.out.println("bill without GST is:"+bill); 
        System.out.println("bill  with GST is:"+Bill);
        k.close();
    }   
    
}
