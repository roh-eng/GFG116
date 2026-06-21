/* Structure for link list Node
class Node {
  public:
    int data;
    public Node next;
    public Node(int val) {
        data = val;
        next = null;
    }
}; */

class Solution {
    public int sumofNodes(Node head, int n) {
        // code here
        Node temp=head;
        int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        int sum=0;
        Node tem=head;
        int skip=length-n;
        for(int i=0;i<skip;i++){
            if(tem!=null){
                tem=tem.next;
            }
            
        }
        while(tem!=null){
            
            sum=sum+tem.data;
            tem=tem.next;
        }
        return sum;
    }
};