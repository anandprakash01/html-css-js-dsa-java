#include<iostream>
using namespace std;
class node{
    public:
    int data;
    node* next;
    node(int val){
        data=val;
        next=NULL;
    }
};
void insertAtHead(node* &head, int val){
    node* b=new node(val);
    b->next=head;
    head=b;

}
void insertAtTail(node* &head,int val){
    node* n= new node(val);
    if(head==NULL){
        head=n;
        return;
    }
    node* temp=head;

    while(temp->next!=NULL){
        temp=temp->next;
    }
    temp->next=n; 
    n->next=NULL;
}
void display(node* head){
    node* temp=head;
    while(temp!=NULL){
        cout<<temp->data <<" -> ";
        temp=temp->next;
    }
    cout<<"NULL"<<endl;
}
bool search(node* &head,int key){
    node* temp=head;
    while(temp!=NULL){

        if(temp->data==key){
            return true;
        }
        temp=temp->next;
    }
    return false;
}
int main()
{
    node* head=NULL;
    insertAtTail(head,4);
    insertAtTail(head,8);
    insertAtTail(head,9);
    insertAtTail(head,3);
    display(head);
    insertAtHead(head,1);
    display(head);
    cout<<search(head,5);

    return 0;
}