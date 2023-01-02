class stck {
    int arr[]=new int[10];
    int size =10;
    int top = -1;

    void push(int x){
        if(top==size-1){
            System.out.println("stack full");
        }
        else{
            top=top++;
            arr[top]=x;
        }
    
        }
        int pop(){
            if(top==-1){
                System.out.println("stack empty");
            }
           
          return arr[top--];
        }
        
        }
    



public class push{
    public static void main(String[] args) {
        stck obj = new stck();
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(60);
    }
}
