import java.net.*;

import java.io.*;

public class server {
    int i=0;
    public static void main(String[] args) {
        
        try{
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("server is running:::");
        while(true)
        {
            Socket s = ss.accept(); //to establish the connection
        System.out.println("connected");
        PrintStream ps= new PrintStream(s.getOutputStream());
        ps.print("hey avi how are you");
        s.close();
        ss.close();
        } } catch (Exception e) {
            System.out.println("connected");
        }
    }
}
