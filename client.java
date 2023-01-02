import java.net.*;
import java.io.*;
public class client{
    public static void main(String[] args) {
        try{
            Socket s = new Socket("localhost",4568);
            System.out.println("connected to server");
            s.close();
        }catch(Exception e){

        }
    }
}