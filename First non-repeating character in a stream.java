class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        Map<Character,Integer> map=new HashMap<>();
        Queue<Character> q=new LinkedList<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<A.length();i++){
            char c=A.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            q.add(c);
            
            while(!q.isEmpty()){
                if(map.containsKey(q.peek()) && map.get(q.peek())>1)
                    q.poll();
                else 
                    break;
            }
            if(q.isEmpty()) sb.append("#");
            else sb.append(q.peek());
        }
        return sb.toString();
    }
}


====================================================================================
class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        int map[]=new int[26];
        Queue<Character> store= new LinkedList<>();
        StringBuilder result=new StringBuilder();
        for(char c:A.toCharArray()){
            map[c-'a']++;
            store.add(c);
            boolean check=false;
            
            while(!store.isEmpty()){
                char fStore=store.peek();
                if(map[fStore-'a']==1){
                    result.append(fStore);
                    check=true;
                    break;
                }else
                    store.remove();
            }
            if(!check) result.append("#");
        }
        return result.toString();
    }
}
