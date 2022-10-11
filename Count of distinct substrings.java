class Trie{
    boolean isend;
    Trie t[]=new Trie[26];
    Trie(){
        for(int i=0;i<26;i++){
            t[i]=null;
        }
        isend=false;
    }
}

class GfG
{
   public static int countDistinctSubstring(String st)
   {
       //your code here
      Trie trie=new Trie();
      int count =0;
        for(int i=0;i<st.length();i++){
            count+=insert(trie,st,i);
        }
      
    return count+1;
   }
   static int insert(Trie root,String key,int j){
        Trie current=root;
        int count=0;
        for(int i=j;i<key.length();i++){
            
        char c=key.charAt(i);
            if(current.t[c-'a']==null){
                count++;
                Trie newNode=new Trie();
                current.t[c-'a']=newNode;
            }
        current=current.t[c-'a'];
    }
    current.isend=true;
    return count;
   }
}
