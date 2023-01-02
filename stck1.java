import java.util.Stack;

public class stck1 {
    public static void main(String[] args) {
        Stack<Integer> marks= new Stack<>();
        marks.push(10);
        marks.push(20);
        marks.push(30);
        marks.push(40);
        System.out.println(marks);
       // marks.pop();
        System.out.println(marks);
        Stack<String> st= new Stack<String>();
        st.push("Avi");
        st.push("Avin");
        System.out.println(st);
       // st.pop();
       
        st.push("Avin");
        System.out.println(st);
        st.peek();
       System.out.println(st.capacity()); 
       System.out.println(marks.capacity()); 
       System.out.println(st.peek()); 
       System.out.println(marks.peek());
       
    }
    
}
