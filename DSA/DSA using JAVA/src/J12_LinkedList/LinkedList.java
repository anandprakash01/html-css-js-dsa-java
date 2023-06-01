package J12_LinkedList;


public class LinkedList {
    public Node head;
    public Node tail;
    public int size;
    public Integer next;

    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data){
        Node newnode=new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
        tail=tail.next;
    }

    public void addMiddle(int idx,int data){
        if(idx<0 || idx>getSize()){
            System.out.println("Index is out of bound");
            return;
        }
        Node newnode=new Node(data);
        size++;
        if(idx==0){
            newnode.next=head;
            head=newnode;
            return;
        }
        if(idx==size-1){// 0 based indexing i.e. last node of LL
            tail.next=newnode;
            tail=tail.next;
            return;
        }
        int i=0;//zero based index
        Node temp=head;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }

    public int removeFirst(){
        if(head==null){
            System.out.println("Linked List is Empty...!!");
            return -1;
        }
        int deletedVal=head.data;
        size--;

        if(head.next==null){//or head==tail;
            head=tail=null;
            return deletedVal;
        }
        head=head.next;
        return deletedVal;
    }

    public int removeLast(){
        if(head==null){
            System.out.println("Linked List is Empty...!!");
            return -1;
        }
        size--;
        if(head.next==null){// or head==tail;
            int deletedVal=head.data;
            head=tail=null;
            return deletedVal;
        }
        Node pre=head;
        while(pre.next.next!=null){
            pre=pre.next;
        }
        int x=pre.next.data;
        tail=pre;
        pre.next=null;
        return x;
    }

    public void print(){
        if(head==null){
            System.out.println("List is Empty...!!");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public int getSize(){
        if(head==null){
            return 0;
        }
        Node temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
}
