import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class client1{
    public static void main(String[] args) {
        try{
            Socket s = new Socket("10.68.98.201",5000);
            System.out.println("connected to server");
            BufferedReader rd = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String st= rd.readLine();
            System.out.println(st);
            s.close();
        }catch(Exception e){
           
        }
    }
}