import java.util.*;
public class _049_calculate_grades {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks: ");
        int n1=sc.nextInt();
        if(n1>=90){
            System.out.println("your grade is: A");
        }else if(n1>=75){
            System.out.println("your grade is: B");

        }
        else if(n1>=60){
            System.out.println("your grade is: C");

        }else if(n1>=30){
            System.out.println("your grade is: D");

        }else {
            System.out.println("your grade is: F");

        }sc.close();
    }
}
