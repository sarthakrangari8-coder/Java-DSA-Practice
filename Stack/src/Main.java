class Stack{
    int arr[];
    int capacity;
    int top;

    //constructor
    Stack(int size){
        arr=new int[size];
        this.capacity=size;
        top=-1;
    }

    //insert element
    void push(int data){
        if (top==capacity){
            System.out.println("Stack Overflow....");
            return;
        }
        arr[++top]=data;
    }

    //print stack
    void printStack(){
        if (top==-1){
            System.out.println("Stack is empty.....");
            return;
        }
        for (int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    //peek
    int peek(){
        if (top==-1){
            System.out.println("Stack is empty....");
            return -1;
        }
        return arr[top];
    }

    //remove element
    int pop(){
        if (top==-1){
            System.out.println("Stack is empty....");
            return -1;
        }
        int x=arr[top--];
        return x;
    }


}



public class Main {
    public static void main(String[] args) {
        Stack st=new Stack(10);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.printStack();
        System.out.println(st.pop());
        st.printStack();
        System.out.println(st.peek());
    }


}