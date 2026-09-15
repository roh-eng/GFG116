/* Structure of doubly linked list Node
class Node {
  public int data;
  public Node next;
  public Node prev;

  public Node(int x) {
      data = x;
      next = null;
      prev = null;
  }
};*/
class Solution {
    public List<List<Integer>> displayList(Node head) {
        // code here
        List<List<Integer>> result = new ArrayList<>();
        
        
        if(head==null){
            result.add(new ArrayList<>());
            return result;
        }
        ArrayList<Integer> res= new ArrayList<>();
        ArrayList<Integer> res_in=new ArrayList<>();


        Node temp=head;
        while(temp!=null){
            
            res.add(temp.data);
            temp=temp.next;
            
            
        }
        
        
        temp =head;
        while(temp.next!=null){
            // res_in.add(temp.data);
            temp=temp.next;
        }
        
        while(temp!=null){
            res_in.add(temp.data);
            temp=temp.prev;
        }
        result.add(res);
        result.add(res_in);
        return result;
    }
}