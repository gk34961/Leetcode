class gfg {
    Node reorderlist(Node head) {
        // Your code here
        if(head.next==null|| head.next.next==null) return head;
        Node mid=findMidNode(head);
        Node midr=reverseMid(mid.next);
        mid.next=null;
        
        return mergeNode(head,midr);
      
    }
    Node mergeNode(Node head1, Node head2){
        
        Node node=new Node(0);
        Node node1=node;
        int count=0;
        
        while(head1!=null && head2!=null){
            if(count%2==0){
                node.next=head1;
                head1=head1.next;
            }else{
                node.next=head2;
                head2=head2.next;
            }
            node=node.next;
            count++;
        }
        
        while(head1!=null){
            node.next=head1;
            head1=head1.next;
            node=node.next;
        }
        
        while(head2!=null){
            node.next=head2;
            head2=head2.next;
            node=node.next;
        }
        return node1.next;
    }
    Node reverseMid(Node head){
        Node Current=head;
        Node next=null;
        Node prev=null;
        
        while(Current!=null){
            next=Current.next;
            Current.next=prev;
            prev=Current;
            Current=next;
        }
        return prev;
    }
    Node findMidNode(Node head){
        Node fast=head;
        Node slow=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}
