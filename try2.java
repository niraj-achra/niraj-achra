import java.io.IOException;
import java.util.Scanner;

public class try2 {
    public static void checkAge(int age)throws IOException{
        if(age<18){
            throw new ArithmeticException();
        }
        else{
            System.out.println("eligible for voting");
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        obj.close();
        System.out.println("enter your age");
        int age= obj.nextInt();
        try{
            checkAge(age);
        }
        catch(Exception e){
            System.out.println(e);
        }
        }
    }

