// arithmatic operators for given values
public class _31_Arithmatic_operator {
    public static void main(String[] args) {
        // /binary operators
        int a=12;
        int b=3;
        System.out.println("addition is " + (a+b));
        System.out.println("substraction is " + (a-b));
        System.out.println("multipication " + (a*b));
        System.out.println("divide is " + (a/b));
        System.out.println("modulo is " + (a%b));


        // unary operators
          // 1.increment ++
                 //a.preincrement ++a
                 //b.postincrement a++  
           // 2.decrement --
                 //a.predecrement --a
                //b.postdecrement a--
            
        // preincrement
         int c=10;
        int d=++c;
        System.out.println(c);//11
        System.out.println(d);//11


    // postincrement
        int e=10;
        int f=e++;
        System.out.println(e);//11
        System.out.println(f);//10


        // predecrement
        int g=10;    
        int h=--g;
        System.out.println(g);//9
        System.out.println(h);//9

        // postdecrement
        int i=10;
        int j=i--;
        System.out.println(i);//9
        System.out.println(j);//10



        
    }   
    
}
