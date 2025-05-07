public class _078_calling_a_funnctions {
    public static void main(String[] args) {
       System.out.println("1");
       System.out.println("2");
        greet();
        System.out.println("3");
        
    }
    public  static void greet(){
        System.out.println("4");
         System.out.println("hello world");
         System.out.println("5");
    }
    
}
// output-
/// 1
// 2
// 4
// hello world
// 5
// 3
