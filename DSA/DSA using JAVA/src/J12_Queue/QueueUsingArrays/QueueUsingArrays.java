package J12_Queue.QueueUsingArrays;

public class QueueUsingArrays {
    static class Queue{
        int[] a;
        int size;
        int rear;
        Queue(int size){
            this.size=size;
            a=new int[size];
            rear=-1;
        }

        boolean isEmpty(){
            return rear==-1;
        }

        void add(int data) {        //O(1)
            if(rear==size-1){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            a[rear]=data;
        }

        int remove(){       //O(n)
            if(rear==-1){
                System.out.println("Queue is empty");
                return -1;
            }
            int front=a[0];
            for(int i=0;i<rear;i++){
                a[i]=a[i+1];
            }
            rear--;
            return front;
        }

        int peek(){     //O(1)
            if(rear==-1){
                System.out.println("Queue is empty");
                return -1;
            }
            return a[0];
        }
    }
    public static void main(String[] args){
        Queue q=new Queue(5);
        q.add(2);
        q.add(4);
        q.add(6);
        q.add(8);
        q.add(10);
        System.out.println( q.remove());
        q.add(20);
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
        System.out.println();
    }
}
