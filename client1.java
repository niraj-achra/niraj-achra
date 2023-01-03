
import java.io.PrintStream;
import java.net.*;
import java.util.Scanner;

public class client1{
    public static void main(String[] args) {
        try{
           
            Socket s = new Socket("localhost",8520);
            System.out.println("connected to server");
            while(true){
           
           
           
           
            while(true){
                Scanner sc1=new Scanner(System.in);
                int num =sc1.nextInt();
                PrintStream ps = new PrintStream(s.getOutputStream());
                ps.println(num);
                Scanner na= new Scanner(s.getInputStream());
                String nb=na.nextLine();
            System.out.println(nb);
    } 
}
}
     catch(Exception e){
           
        }
    
 
    }
}  