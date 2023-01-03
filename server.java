import java.net.*;
import java.util.Scanner;
import java.io.*;

public class server {
    int i=0;
    public static void main(String[] args) {
        
        try{
        ServerSocket ss = new ServerSocket(8520);
        System.out.println("server is running:::");
        while(true)
        {
            Socket s = ss.accept(); //to establish the connection
        System.out.println("connected");
        
        
        
        while(true){
            Scanner sc1=new Scanner(s.getInputStream());
            int num=sc1.nextInt();
            String r;
            if(num%2==0){
              r="this no.is even no.";
            }
            else{
               r="this no.is odd no.";
            }
            PrintStream ps=new PrintStream(s.getOutputStream());
            ps.println(r);
        
        }
    }
       
       
         } catch (Exception e) {
           
        }
    }
}
