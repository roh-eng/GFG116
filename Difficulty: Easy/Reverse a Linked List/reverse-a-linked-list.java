/* Structure of Linked List Node
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
        Stack<Integer> r=new Stack<>();
        Node temp=head;
        while(temp!=null){
            r.push(temp.data);
            temp=temp.next;
        }
        
        temp=head;
        while(temp!=null){
            temp.data=r.peek();
            r.pop();
            temp=temp.next;
        }
        return head;
    }
}