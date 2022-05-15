class Sol
{
	public static Node findUnion(Node head1,Node head2)
		{
	    TreeMap<Integer,Integer> tm=new TreeMap<>();
	    Node temp1=head1;
	    Node temp2=head2;
	    while(temp1!=null && temp2!=null){
	        tm.put(temp1.data,1);
	        tm.put(temp2.data,1);
	        temp1=temp1.next;
	        temp2=temp2.next;
	    }
	    while(temp1!=null){
	        tm.put(temp1.data,1);
	        temp1=temp1.next;
	    }
	    while(temp2!=null){
	        tm.put(temp2.data,1);
	        temp2=temp2.next;
	    }
	    
	    //System.out.println(tm);
	    
	    Node newNode=new Node(-1);
	    Node temp3=newNode;
	    for(Map.Entry<Integer,Integer> m:tm.entrySet()){
	        Node temp=new Node(m.getKey());
	        temp3.next=temp;
	        temp3=temp3.next;
	    }
	    return newNode.next;
	}
}
