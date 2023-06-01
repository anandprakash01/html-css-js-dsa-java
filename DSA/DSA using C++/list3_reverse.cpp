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
node* reverse(node* &head){
    node* preptr=NULL;
    node* currptr=head;
    node* nextptr;
    while(currptr!=NULL){
        nextptr=currptr->next;

        currptr->next=preptr;

        preptr=currptr;
        currptr=nextptr;
    }
    return preptr;
}
void insertAtHead(node* &head, int val){
    node* b=new node(val);
    b->next=head;
    head=b;
}
void insert(node* &head, int val){
    node* n= new node(val);
    if(head==NULL){
        head=n;
        return;
    }
    node* temp= head;
    while(temp->next!=NULL){
        temp=temp->next;
    }
    temp->next=n;
    n->next=NULL;
}

void display(node* head){
    node* temp=head;
    while(temp!=NULL){
        cout<<temp->data<<" ";
        temp=temp->next;
    }
    cout<<endl;
}
int main()
{
    node* head=NULL;
    // insertAtHead(head,5);
    insert(head,6);
    insert(head,9);
    insert(head,4);
    insert(head,8);
    display(head);
    insertAtHead(head,1);
    display(head);
    node* newhead=reverse(head);
    display(newhead);

    return 0;
}