// type promotion
import java.util.Scanner;

public class _029_Type_promotion2 {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        byte b=4;
        char c='a';
        short s =512;
        int i=1000;
        float f=3.14f;
        double d=99.9954;

      double  result=(f*b)+(i%c)-(d*s);
      System.out.println(result);
      m.close();
    }
}
