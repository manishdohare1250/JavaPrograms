// SWITCH CASE--check entered  alphabet character is vowel or consonant
import java.util.*;
public class _52_Switchcase_vowel_consonant {//GOOD PRACTICE OF WRITING CLASS NAME --class name should  start with capital letter,,, ex- Switchcase

    public static void main(String[] args) {
        Scanner  k = new Scanner(System.in);
        System.out.println("enter an alphabet character  :");
        char ch=k.next().charAt(0);
        switch (ch) {
            case 'a':System.out.println(ch +" is a Vowel");
                     break;
            case 'e':System.out.println(ch +" is a Vowel");
                     break;
            case 'i':System.out.println(ch +" is a Vowel");
                     break;
            case 'o':System.out.println(ch +" is a Vowel");
                     break;
            case 'u':System.out.println(ch +" is a Vowel");
                     break;
            case 'A':System.out.println(ch +" is a Vowel");
                     break;
            case 'E':System.out.println(ch +" is a Vowel");
                     break;
            case 'I':System.out.println(ch +" is a Vowel");
                     break;
            case 'O':System.out.println(ch +" is a Vowel");
                     break;
            case 'U':System.out.println(ch +" is a Vowel");
                     break;
            default:System.out.println(ch + " is a Consonant");
                     break;
        }
        k.close();
    }
}
