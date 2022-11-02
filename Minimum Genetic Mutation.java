class Solution {
    public int minMutation(String start, String end, String[] bank) {
        Map<String,Boolean> map=new HashMap<>();
        for(String word:bank) map.put(word,false);
        
        Queue<String> queue=new LinkedList<>();
        queue.offer(start);
        int count=0;
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                String fromQ=queue.remove();
                //System.out.println(fromQ+"   "+end);
                if(fromQ.equals(end)) return count;
                find(fromQ,map,queue);
            }
            count++;
        }
        
        return -1;
    }
    
    void find(String origin, Map<String,Boolean> map,Queue<String> queue){
        
        
        for(int i=0;i<origin.length();i++){
            for(int j=0;j<26;j++){
                char c[]=origin.toCharArray();
                char temp=(char)('A'+j);
                c[i]=temp;
                
                String s=String.valueOf(c);
                if(map.containsKey(s) && !map.get(s)){
                    map.put(s,true);
                    queue.offer(s);
                }
            }
        }
    }
}
