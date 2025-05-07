// switchcase__ even -odd
import java.util.*;
public class _053_Switchcase_vowel_consonant_2 {
    public static void main(String[] args) {
        Scanner k = new Scanner (System.in);
        System.out.println("enter alphabet character");
        char ch=k.next().charAt(0);
        switch (ch) {
            case 'a','e','i','o','u','A','E','I','O','U' -> System.out.println(ch + " is a vowel");
            
              
        
            default-> System.out.println(ch + " is a consonant");

              
        }
        k.close();

    }
    
}
