// Taking input  from users  in java
import java.util.*;   // import java package 
public class _11_Input_statements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        /*
         *  Scanner is a class which is used to take input,
         * sc is object,
         * new is keyword,
         * System.in is a method
         */
       
       
       
        /*
         * Now we want to take a variable as input then  we follow this --
         *  _Datatype _Nameofvariable= Object.inputmethod;
        */

        System.out.println("Enter your sentence :");
        String input=sc.next();                      
        System.out.println(input);

        // System.out.println("Enter your string :");
        // String name=sc.nextLine();                  
        // System.out.println(name);

        System.out.println("Enter your int number:");
        int number=sc.nextInt();                   
        System.out.println(number);

        System.out.println("Enter your floating number:");
        float price=sc.nextFloat();                   
        System.out.println(price);
       /*
        * To take char as input we do ---- 
        */
        System.out.print("Enter a character: "); 
        char ch = sc.next().charAt(0);
        System.out.println(ch);

        sc.close();

        /*
         * <Inputmethod>                 <function>
            1. next()                     Takes String upto space
            2. nextLine()                 Takes entire line including space
            3. nextInt()                  Takes integer as input
            4. nextFloat()                Takes float as input
            5. nextLong()                 Takes Long as input
            6. nextDouble()               Takes double as input 
            7. nextShort()                Takes short as input
            8. nextByte()                 Takes byte as input
            9. nextBoolean()              Takes boolean as input
         */
    }
    
}
