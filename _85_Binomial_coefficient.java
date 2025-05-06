// find binomial function for given n and r
public class _85_Binomial_coefficient {
    public static void main(String[] args) {
       
       System.out.println(BinCoef(5, 2));
        }
   public static  int factorial(int n){
      int fact=1;
       for(int count=1;count<=n;count++){
           fact=fact*count;
       }
     return fact;
   }
   public  static int BinCoef(int n,int r){
    int fact_n=factorial(n);
    int fact_r= factorial(r);
    int fact_nmr= factorial(n-r);
    int BinCoef= fact_n/(fact_r*fact_nmr);
    return BinCoef;
   }
   
}

    

