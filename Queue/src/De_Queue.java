public class De_Queue {
    int []arr;
    int front,rear,n;

    De_Queue(int size){
        arr=new int[size];
        front=-1;
        rear=0;
        n=size;
    }

    //isFull
    boolean isFull(){
        return (front==0 && rear==n-1) || (front==rear+1);
    }

    //isEmpty
    boolean isEmpty(){
        return front==-1;
    }

    //insertFromFront
    void insertFromFront(int element){
        if (isFull()){
            System.out.println("Queue is full");
            return ;
        }
        //case 1 : if front is on -1 point him to 0 and rear also;
        if (front==-1){
            front=rear=0;
        //case 2 : if front is go to 0 move him backward
            // because he insert form back
        }else if (front==0){
            front=n-1;
        }else{ //case 3 : when we insert new element we decrease front
            front--;
        }
        arr[front]=element;
    }

    //insertFromRear
    void insertFromRear(int element){
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        } if (front==-1){
            front=rear=0;
        } else if (rear==n-1) {//rear is on last position we bring him to first;
            rear=0;
        }else {
            rear++;
        }
        arr[rear]=element;
    }

    //removeFromFront
    int removeFromFront(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        //case 1: if front and rear at same place point them to -1;
        int element=arr[front];
        if (front==rear){
             element=arr[front];
            front=rear=-1;
        } else if (front==n-1) {//if front is on last we point him first;
            element=arr[front];
            front=0;
        }else{
            front++;
        }
        return element;

    }
    //removeFromRear
    int removeFromRear(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int element =arr[rear];

        if (front ==rear){
            element=arr[rear];
            front=rear=-1;
        }else if (rear==0){
            element=arr[rear];
            rear=0;
        }else {
            rear--;
        }
        return element;
    }
    //print
    void print (){
        if (isEmpty()){
            System.out.println("queue is empty");
            return ;
        }
        int i=front;
        while (true){
            System.out.print(arr[i] + " ");
            if (i==rear)break;

            i=(i+1)%n;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        De_Queue dq=new De_Queue(10);
        dq.insertFromFront(10);
        dq.insertFromFront(20);
        dq.print();
        dq.insertFromRear(40);
        dq.insertFromRear(50);
        dq.print();
        dq.removeFromFront();
        dq.print();
        dq.removeFromRear();
        dq.print();
    }


}
