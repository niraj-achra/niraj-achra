import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class AgeException extends Exception {
   
   AgeException(String st){
    super(st);
   }
}
 class ThrowExcpt{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter your age");
        int age= obj.nextInt();
        obj.close();
        try{
             if(age<18){
                throw new AgeException("Entered age is below 18");
             }
             else{
                System.out.println("you are eligible");
             }
             
        }
        catch(Exception e){
            System.out.println(e);
        }
}
}
