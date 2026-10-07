import java.util.Stack;

class DesignMInStack {
    Stack<Long>Stack;
    long min;

    public DesignMInStack(){
        Stack=new Stack<>();

    }
    public void push(int data){
        //if stack is empty
        if (Stack.isEmpty()){
            Stack.push((long) data);
            min=data;
        }else if (data<min){
            Stack.push(2L*data-min);
            min=data;
        }else {
            Stack.push((long) data);
        }
    }

    public void pop(){
        long top= Stack.peek();

        if (top<min){
            min =2*min-top;
        }
        Stack.pop();
    }

    public int top(){
        long top=Stack.peek();

        if (top<min) return(int)min;

        return(int) top;
    }

    public int getMin(){

        return(int)min;
    }


    public static void main(String[] args) {

        DesignMInStack stack = new DesignMInStack();

        stack.push(5);
        stack.push(3);
        stack.push(7);
        stack.push(2);

        System.out.println("Minimum: " + stack.getMin());
        System.out.println("Top: " + stack.top());

        stack.pop();

        System.out.println("After pop:");
        System.out.println("Minimum: " + stack.getMin());
        System.out.println("Top: " + stack.top());

        stack.pop();

        System.out.println("After another pop:");
        System.out.println("Minimum: " + stack.getMin());
        System.out.println("Top: " + stack.top());
    }
}
