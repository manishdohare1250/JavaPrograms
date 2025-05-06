//arrays in java
import java.util.*;
public class _108_Arrays {
    public static void main(String[] args) {
      ///Array is list of similar type of element/data placed  
      //in contiguous ,memory location  .
      /*example ;
      int array[]=new int[50];
      int numbers[]={2,4,6};
      String fruits[]={"apple","orrange" ,"mango"};
       * 
       */
     
     
     
    //  creation of array
       int marks[]=new int[50];
           //int numbers[]={1,3,5};
           //String fruits[]={"mango","orrange"};
     ///taking inputs in array
        Scanner sc=new Scanner(System.in);
                 // int phy;-------normal varriable
                //phy=sc.nextint();---normal variable

        /// for  taking input in arrays we write
        // array name[index]=sc.nextInt();
       System.out.println(" Enter value for your array 'marks':");
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        marks[3]=sc.nextInt();
        System.out.print("Your arrays is:  marks = {");
        System.out.print(marks[0]+",");
        System.out.print(marks[1]+",");
        System.out.print(marks[2]+",");
        System.out.print(marks[3]+"}");
        System.out.println("\nlength of array is:"+marks.length );
        sc.close();

        









    }
    
}
