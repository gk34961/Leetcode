class Solution {
    public int[] movesToStamp(String stamp, String target) {
        char[] tchar=target.toCharArray();
        char[] schar=stamp.toCharArray();
        boolean visited[]=new boolean[target.length()];
        int qm=0;
        List<Integer> list=new ArrayList<>();
        boolean change=false;
        while(qm<target.length()){
            change=false;
            for(int i=0;i<(target.length()-stamp.length()+1);i++){
                if(!visited[i] && isReplacable(i,schar,tchar)){
                    qm+=replace(i,tchar,schar);
                    visited[i]=true;
                    change=true;
                    list.add(i);
                }
            }
            if(!change) return new int[0];
        }
/*Making an array of size list and entering the value in reverse*/
        int ans[]=new int[list.size()];
        for(int i=0;i<ans.length;i++){
            ans[i]=list.get(list.size()-i-1);
        } 
        return ans;
    }
    
    boolean isReplacable(int index,char[] stamp,char[] target){
        for(int i=0;i<stamp.length;i++){
            if(stamp[i]!=target[index+i] && target[index+i]!='*') return false;
        }
        return true;
    }
    
    int replace(int index,char[] target,char[] stamp){
        int count=0;
        for(int i=0;i<stamp.length;i++){
            if(target[index+i]!='*'){
                target[index+i]='*';
                count++;
            }
        }
        return count;
    }
}
