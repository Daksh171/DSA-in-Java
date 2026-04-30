import java.util.*;

public class push_At_Bottom {
    public static void pushBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
           s.push(data);
           return;
        }
        int temp = s.pop();
        pushBottom(s, data);
        s.push(temp);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.add(1);
        s.add(2);
        s.add(3);
        pushBottom(s, 9);
        pushBottom(s, 0);
        System.out.println(s);
    }
}
