class GfG
{
    //Function to insert a new node at given position in doubly linked list.
    void addNode(Node head_ref, int pos, int data)
	{
		// Your code here
		Node newNode = new Node(data);
        Node temp = head_ref;
        
        for(int i=0; i<pos; i++){
            if(temp.next!=null){
                temp = temp.next;
          }else
              break;
        }
        
        if(temp.next!=null){
            temp.next.prev = newNode;
            newNode.next = temp.next;
            }
            
        newNode.prev = temp;
        temp.next = newNode;
    }
}
