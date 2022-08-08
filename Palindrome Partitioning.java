class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result=new ArrayList<>();
        function(s,new ArrayList<>(),result,0);
        return result;
    }
    void function(String s,List<String> list,List<List<String>> result,int start){
        if(start==s.length()){
            result.add(new ArrayList<>(list));
        }
        else{ 
            for(int i=start;i<s.length();i++){
                if(isPalindrome(s,start,i)){
                    list.add(s.substring(start,i+1));
                    function(s,list,result,i+1);
                    list.remove(list.size()-1);
                }
            }
       }
    }
    
    boolean isPalindrome(String s,int i,int j){
        while(i < j)
            if(s.charAt(i++) != s.charAt(j--)) return false;
        return true;
    }
}
