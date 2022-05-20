class LinkedList
{
    //Function to sort the given doubly linked list using Merge Sort.
    static Node sortDoubly(Node head)
    {
        // add your code here
        if(head==null || head.next==null) return head;
        Node n1=head;
        Node mid=findMiddle(head);
        Node n2=mid.next;
        mid.next=null;
        
        n1=sortDoubly(n1);
        n2=sortDoubly(n2);
        return merge(n1,n2);
        
    }
    static Node findMiddle(Node head){
        Node fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    static Node merge(Node first, Node second) {
        
        if (first == null) 
            return second;
        if (second == null) 
            return first;
 
        if (first.data < second.data) {
            first.next = merge(first.next, second);
            first.next.prev = first;
            first.prev = null;
            return first;
        } else {
            second.next = merge(first, second.next);
            second.next.prev = second;
            second.prev = null;
            return second;
        }
    }
}
