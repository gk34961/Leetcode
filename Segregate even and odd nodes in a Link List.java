class Solution{
    Node divide(int N, Node head){
        
        Node current=head;
        Node even=null;
        Node odd=null;
        
        Node e=null;
        Node o=null;
        while(current!=null){
            if(current.data%2==0){
                if(even==null){
                    even=current;
                    e=current;
                }
                else{
                    even.next=current;
                    even=even.next;
                }
            }else{
                    if(odd==null){
                    odd=current;
                    o=current;
                }
                else{
                    odd.next=current;
                    odd=odd.next;
                }
            }
            current=current.next;
            }
        if(even!=null) even.next=o;
        if(odd!=null) odd.next=null;
        if(e!=null)
            return e;
        else
            return o;
    }
}
