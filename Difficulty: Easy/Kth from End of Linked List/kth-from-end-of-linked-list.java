/* Structure of linked list Node
class Node
{
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/
class Solution {
    int getKthFromLast(Node head, int k) {
        // code here
        int count=0;
        int x=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
            
        }
        if(count<k){
            return -1;
        }
        Node tem=head;
        for(int i=0;i<count-k;i++){
            tem=tem.next;
        }
        return tem.data;
    }
}