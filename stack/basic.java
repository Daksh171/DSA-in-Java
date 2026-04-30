import java.util.ArrayList;


class basic{
     static class stack{
     ArrayList<Integer> s = new ArrayList<>();
     int top=0;
 
        public  boolean  isEmpty(){
            return s.size()==0;
        }
        public  void push(int data){
            s.add(data);
        }
        public void pop(){
            if(s.isEmpty()){
                System.out.println("Stack is Empty");
               return ;
            }
          s.remove(s.size()-1);
        }
        public int  peek(){
            if(s.isEmpty()){
                System.out.println("Stack is Empty");
               return -1;
            }
            return s.get(s.size()-1);
        }

}
    
    public static void main(String[] args) {
        stack s = new stack();
        s.push(12);
        s.push(13);
        s.push(90);
        s.pop();
        System.out.println(s.peek());

       while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
       }

    }
}