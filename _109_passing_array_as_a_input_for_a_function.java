
 public class _109_passing_array_as_a_input_for_a_function{
    public static void update(int marks[],int number){
        number=10;
         for(int i=0;i<marks.length;i++){
             marks[i]=marks[i]+1;
         }
 /////array passing as input  in function it works on call by refrence
     } 
 public static void main(String[] args) {
        int marks[]={97,98,99}; 
        int number=6;
        update(marks, number);
        System.out.println(number);
        //print marks from array
        for(int i=0;i<=marks.length;i++){
            System.out.println(marks[i]+" ");
        }
        System.out.println();
    }
    
 }