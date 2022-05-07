class Solution{
    static int maxLength(String S){
        // code here
        int open=0;
        int close=0;
        int max=0;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='(')
                open++;
            else
                close++;
            if(open==close) max=Math.max(max,open+close);
            else if(close>open) open=close=0;
        }
        
        open=close=0;
        for(int i=S.length()-1;i>=0;i--){
            if(S.charAt(i)=='(')
                open++;
            else
                close++;
            if(open==close) max=Math.max(max,open+close);
            else if(close<open) open=close=0;
        }
        return max;
    }
}
