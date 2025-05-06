public class _79_practice_on_function_calling {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        greet();
        System.out.println("4");

        
    }
    public static  void greet(){
        System.out.println("5");
        System.out.println("6");
        walk();
        System.out.println("7");
    }
    public static  void walk(){
        System.out.println("8");
        System.out.println("9");
    }
    
}
/*
 output:-
1
2
3
5 /greet function 
6      /walk
8      /walk
9/greet function
7
4
 */
