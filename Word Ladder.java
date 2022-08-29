class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(!wordList.contains(endWord)) return 0;
        Map<String,Boolean> map=new HashMap<>();
            for(String s:wordList)
                map.put(s,false);
        Queue<String> q=new LinkedList<>();
            q.add(beginWord);
            
            int count=1;
            while(!q.isEmpty()){
                int size=q.size();
                for(int i=0;i<size;i++){
                    String t=q.remove();
                    if(t.equals(endWord)) return count;
                        findMatch(t,map,q);
                }
                count++;
            }
            return 0;
    }
    void findMatch(String t,Map<String,Boolean> map,Queue<String> q){
        for(int i=0;i<t.length();i++){
            char c[]=t.toCharArray();
            for(int j=0;j<26;j++){
                char tem=(char)('a'+j);
                c[i]=tem;
                String temp=String.valueOf(c);
                if(map.containsKey(temp) && !map.get(temp)){
                    map.put(temp,true);
                    q.add(temp);
                }
            }
        }
    }
}
