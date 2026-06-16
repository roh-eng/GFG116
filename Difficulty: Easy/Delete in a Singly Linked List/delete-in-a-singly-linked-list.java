/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        if(head.next==null && head==null){
            return null;
        }
        
        Node temp=head;
        
        if(x==1){
            head=head.next;
            return head;
        }
        
        Node prev=null;
        
        for(int i=1;i<x;i++){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
        return head;
    }
        
        // while(temp.next.next!=null){
            
        // }
        static void printll(Node head){
        while(head !=null){
            System.out.print(head.data +" -> ");
            head=head.next;
        }
        }
    }
