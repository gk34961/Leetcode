class Solution
{
    void rearrangeEvenOdd(Node head)
    {
          //  The task is to complete this method
         Node current=head;
        Node even=null;
        Node odd=null;
        
        Node e=null;
        Node o=null;
        int count=1;
        while(current!=null){
            if(count%2==0){
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
            count++;
            }
        if(even!=null) odd.next=e;
        if(odd!=null && even!=null) even.next=null;
        if(o!=null)
            head =o;
        else
            head =e;
    }
     
}
