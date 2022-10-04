class Solution {
    public ArrayList<String> huffmanCodes(String S, int f[], int n)
    {
        // Code here
       PriorityQueue<Node> pq=new PriorityQueue<>((a,b)->a.data==b.data?1:a.data-b.data);
		
        for(int i=0;i<n;i++){
            pq.add(new Node(f[i]));
        }
        
        while(pq.size()>1){
            Node one=pq.remove();
            Node two=pq.remove();
            
            Node parent=new Node(one.data+two.data);
            parent.left=one;
            parent.right=two;
            pq.add(parent);
        }
        
        Node node=pq.remove();
        ArrayList<String> list=new ArrayList<>();
        preordertraversal(node,list,"");
        return list;
    }
    void preordertraversal(Node node,ArrayList<String> list,String s){
        if(node.left==null && node.right==null) {
            list.add(s);
            return;
        }
        preordertraversal(node.left,list,s+"0");
        preordertraversal(node.right,list,s+"1");
    }
}

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
