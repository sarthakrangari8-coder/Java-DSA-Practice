 class CircularQueue {
    int [] arr;
    int front,rear,n;

    CircularQueue(int size){
        arr=new int[size];
        front=rear=-1;
        n=size;
    }

    //isFull
     boolean isFull(){
        return (rear+1)%n==front;
     }

     //isEmpty
     boolean isEmpty(){
        return front==-1;
     }

     //enqueue
     void enqueue(int element){
        if (isFull()){
            System.out.println("queue is full");
            return;
        }
        //to point front in 0th index if its not
        if (front==-1){
            front=0;
        }
         //move rear by one
        rear=(rear+1)%n;

        arr[rear]=element;
     }

    // dequeue
     int dequeue(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        // if rear and front are in a same position
         // --we need to point them to -1
        if(rear==front){
            front=rear=-1;
            int element=arr[front];//front is change
            return element;
        }
        front=(front+1)%n;//move the front

        return arr[front];

     }

     //print
     void print (){
        if (isEmpty()){
            System.out.println("queue is empty");
            return ;
        }
        int i=front;

        while(true){
            System.out.print(arr[i]+" ");

            if (i==rear) break;

            i=(i+1)%n;
        }
         System.out.println();

     }

     //peek
     int peek(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];

     }

     public static void main(String[] args) {
         CircularQueue cq=new CircularQueue(5);
         cq.enqueue(10);
         cq.enqueue(20);
         cq.enqueue(30);
         cq.enqueue(40);
         cq.print();
         cq.dequeue();
         cq.print();
         cq.enqueue(28);
         cq.print();



     }


}
