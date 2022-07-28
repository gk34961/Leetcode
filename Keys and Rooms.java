class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        boolean store[]=new boolean[n+1];
        store[0]=true;
        
        while(!q.isEmpty()){
            int val=q.poll();
            for(int room:rooms.get(val)){
                if(!store[room]){
                    q.add(room);
                    store[room]=true;
                }
            }
        }
        
        for(int i=0;i<n;i++){
            if(store[i]==false) return false;
        }
        return true;
        
    }
}
