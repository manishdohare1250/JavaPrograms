//calculator
import java.util.*; 
public class _054_Switchcase_arithmatic_calculator {
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);
        System.out.println("enter first number:");
        double m=k.nextDouble();
        System.out.println("enter second number:");
        double n=k.nextDouble();
        System.out.println("enter operator:");
        char operator=k.next().charAt(0);
        switch(operator){
            case '+':System.out.println(m+n);
            break;
            case '-':System.out.println(m-n);
            break;
            case '*':System.out.println(m*n);
            break;
            case '/':System.out.println(m/n);
            break;
            case '%':System.out.println(m%n);
            break;
            default:System.out.println("wrong operator");
        }
        k.close();


        
    }
}
