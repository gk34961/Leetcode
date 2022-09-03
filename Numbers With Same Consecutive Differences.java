class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<10;i++)
            dfs(n,k,i,0,i,list);
        int[] result=new int[list.size()];
        int index=0;
        for(int num:list)
            result[index++]=num;
        return result;
    }
    void dfs(int n,int k,int curr,int index,int prev,List<Integer> list){
        
        if(index==(n-1)){
            list.add(curr);
            return;
        }
    
        int next=prev+k;
        if(next<10)
            dfs(n,k,(curr*10)+next,index+1,next,list);
        next=prev-k;
        if(k!=0 && next>=0)
            dfs(n,k,(curr*10)+next,index+1,next,list);
    }
}
