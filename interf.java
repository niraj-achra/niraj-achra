interface Tcg{
    int a=5;
    void show();//abstract method,public
    void disp();
    String name = "niraj";
}
 interface  java extends Tcg{
    void html();
    public void show();
   public void disp();
}
interface niraj{
void move();
void show();

}
interface ami{
    void go();
}
class sql implements java,niraj,ami{
    public void show(){System.out.println("show");};
    public  void disp(){System.out.println("disp");};
    public void html(){System.out.println("hello html");};
    public void move(){System.out.println("ok");};
    public void go(){System.out.println(" i am walking ");};
}
class css implements java{
    public void show(){System.out.println("show the movie");};
    public  void disp(){System.out.println("disp circus movie in bioscope");};
    public void html(){System.out.println("hello avi ami show time is 6:30");};
}
public class interf {
    public static void main(String[] args) {
        sql obj = new sql();
        obj.show();
        obj.disp();
        obj.html();
        obj.go();
        obj.move();
        css obj1= new css();
        obj1.show();
        obj1.disp();
        obj1.html();

        //System.out.println(obj.a);
        //System.out.println(obj.name);

    }

}