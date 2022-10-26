class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result=new ArrayList<>();
        String res=new String();
        recursion(n,n,result,res);
        return result;
    }
    void recursion(int open,int close,List<String> result,String res){
        
        if(close==0 && open==0){
            result.add(res);
            return;
        }
        if(open!=0){
            String temp=res;
            temp+="(";
            recursion(open-1,close,result,temp);
            
        }
        if(close>open){
            String temp=res;
            temp+=")"; 
            recursion(open,close-1,result,temp);  
        }
    }
}
