/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        Node temp = head;
        Node dummy = temp;
        while(temp != null){
            Node newNode = new Node(temp.val);
            Node nodeNext = temp.next;
            temp.next = newNode;
            newNode.next = nodeNext;
            temp = nodeNext;
        }

        temp = dummy;
        
        while (temp != null) {
            Node copyNode = temp.next;
            if(temp.random != null){
                copyNode.random = temp.random.next;
            }else{
                copyNode.random = null;
            }
            temp = temp.next.next;
            
        }

        temp = dummy;
        Node ans = new Node(-1);
        Node ret = ans;
        while(temp != null){
            Node nextNode = temp.next.next;
            ans.next = temp.next;
            temp.next = nextNode;
            temp = nextNode;
            ans = ans.next;
        }
        

        return ret.next;
        
    }
}
