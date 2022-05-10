class GfG
{
    /*You are required to complete this method*/
    Node delete(Node head, int k)
    {
	// Your code here
	int i=0;
	Node current=head;
	Node prev=null;
	    if(k==1) return null;
	    while(current !=null){
	        i++;
	        if(i==k){
	            prev.next=current.next;
	            i=0;
	        }
	        if(i!=0)
	            prev=current;
	        current=current.next;
	    }
	 
	    return head;
    }
}
