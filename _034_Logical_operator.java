// logical operator
public class _034_Logical_operator {
    public static void main(String[] args) {
        // logical AND
        System.out.println(3<2);  //((3<2)&&(5>0));---if we write commented code here warning pops up as dead code
        System.out.println((3>2) && (5>0));///--------because and operator give  true when all conditons true  but
        System.out.println(3<2);  //((3<2)&&(5<0));....hrere first condition is false so operatoe eliminate next condition as dead code
        System.out.println((3>2) && (5<0));
        // output----
        // false
        // true
        // false
        // false



        // logical OR
        System.out.println((3<2)||(5>0));
        System.out.println(3>2);   ///((3>2)||(5>0));....if we write commented code here warning pops up as dead code
        System.out.println((3<2)|| (5<0));//.....-because OR operator give  true when any one conditons true  but
        System.out.println(3>2);   ///((3>2)||(5<0));.....hrere first condition is true so operatoe eliminate next condition as dead code
        // output-----
        // true
        //   true
        //   false
        //   true



        // logical NOT
        System.out.println(!(0>5));
        System.out.println(!(0<5));
        //output
        // true
        // false 
    }
}
