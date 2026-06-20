/*
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
}*/

class Solution {
    public ArrayList<Integer> printList(Node head) {
        // code here
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        Node tem=head;
        ArrayList<Integer> res= new ArrayList<>();
        for(int i=0;i<count;i++){
            res.add(tem.data);
            tem=tem.next;
        }
        return res;
        
    }
}