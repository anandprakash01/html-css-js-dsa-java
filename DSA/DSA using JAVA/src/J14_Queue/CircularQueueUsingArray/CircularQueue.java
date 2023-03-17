package J14_Queue.CircularQueueUsingArray;

class Queue{
    int size;
    int q[];
    int front=-1;
    int rear=-1;
    Queue(int size) {
        this.size = size;
        q=new int[size];
    }
    boolean isEmpty(){
        return rear==-1 && front==-1;
    }

    boolean isFull(){
        return (rear+1)%size==front;
    }

    void add(int data){
        if(isFull()){
            System.out.println("Error...!!! Queue is full can not enque more elements");
            return;
        }
        if(front==-1){//if first element is added
            front=0;
        }
        rear=(rear+1)%size;
        q[rear]=data;
    }

    int remove(){   //to achieve TC from O(n) to O(1) we use circular Queue
        if(isEmpty()){
            System.out.println("Error...!!! Queue is Empty can not deque element");
            return -1;
        }
        int val=q[front];
        // if last element delete
        if(front==rear){
            front=rear=-1;
        }else{
            front=(front+1)%size;
        }
        return val;
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Error...!!! Queue is Empty can not peek element");
            return -1;
        }
        return q[front];
    }

}
public class CircularQueue {
    public static void main(String[] args){
        Queue q=new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println( q.remove());
        q.add(5);

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}