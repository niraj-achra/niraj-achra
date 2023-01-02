import java.util.*;

class rn{
    int show(){
   Random obj=new Random();
   int a= obj.nextInt(50);
   return a;
  
}
void view(){
    int y=show();
    Scanner x=new Scanner(System.in);
    x.close();
    int flag=0;
    for(int i=0;i<5;i++){
        System.out.println("enter no.0 to 50");
        int num=x.nextInt();
        if(num==y){
            System.out.println("won");
            flag=1;
            break;
        }
        else if (num<y){
            System.out.println("small");
        }
        else{
            System.out.println("big");
        }
        System.out.println("chance left"+(4-1));
    }
    if (flag==0){
        System.out.println("loss");
    }

}
}

public class random {
    public static void main(String[] args) {
        rn obj=new rn();
        obj.view();
    }
    
}
