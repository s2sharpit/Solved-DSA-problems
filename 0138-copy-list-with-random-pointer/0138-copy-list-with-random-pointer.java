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
        HashMap<Node,Node> hashMap=new HashMap<>();
        Node temp = head;
        while(temp != null) {
            Node newNode = new Node(temp.val);
            hashMap.put(temp,newNode);
            temp = temp.next;
        }
        Node t = head;
        while(t != null) {
            Node node = hashMap.get(t);
            node.next = (t.next != null) ? hashMap.get(t.next):null;
            node.random = (t.random != null) ? hashMap.get(t.random):null;
            t = t.next;
        }
        return hashMap.get(head);
    }
}