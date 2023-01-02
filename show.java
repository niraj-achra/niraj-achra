import java.util.Scanner;

class Tcg {
     private String code;
     private int id;
     private String name;

     void show_details(){
         System.out.println("Candidate name :"+name);
         System.out.println("Candidate id :"+id);
         System.out.println("Candidate code :"+code);
     }
    public void getId(int id){
         this.id =id;

    }
    public void setname(String name){
        this.name =name;
    }
    public void getcode(String code){
        this.code =code;
    }
}
class  java extends Tcg{
    public void niraj(){
            Scanner sc = new Scanner(System.in);
           sc.close();
        getcode(sc.next());
        getId(sc.nextInt());
        setname(sc.next());
        show_details();
        
    }

}
public class show{
    public static void main(String[] args) {
        java j=new java();
        j.niraj();
        
    }
}
