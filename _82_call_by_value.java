// call by value or pass by value
// in call by value  --"the value of variables in main function remains same always,.
//                       the value of variable  is only updated for the function which we are called.

public class _82_call_by_value {
    public static void main(String[] args) {
        int a=10;
        System.out.println("Before calling <changeA> function value of <a>(in <<main function>>) is:"+a);
        changeA(a);
        System.out.println("after calling <changeA> function value of <a>(in <<main function>>) is:"+a);

    }
    static void changeA(int a){
        a=a*100;
        System.out.println("after calling <changeA> function value of <a>(in <<changeA function>>) is:"+a);
    }
    
}
