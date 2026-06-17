/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        Node cur=head;
        Node prev=null;
        Node next=null;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            
            
            prev=cur;
            cur=next;
        }
        return prev;
    }
}