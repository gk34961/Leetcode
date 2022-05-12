class Solution
{
    static void linkdelete(Node head, int M, int N)
    {
        // your code here
        int i=0;
        int j=0;
	    Node current=head;
	    Node prev=null;
	       // if(k==1) return null;
	        while(current !=null){
	            if(i!=M){
	                prev=current;
	                current=current.next;
	                i++;
	            }
	            else if(j!=N){
	                j++;
	                current=current.next;
	                
	            }
	            else{
	                prev.next=current;
	                i=0;
	                j=0;
	            }
	        }
	        prev.next=null;
    }
}
