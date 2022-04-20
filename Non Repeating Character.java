class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        //Your code here
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<S.length();i++)
            map.put(S.charAt(i),map.getOrDefault(S.charAt(i),0)+1);
        
        for(Map.Entry<Character,Integer> m:map.entrySet()){
            if(m.getValue()==1)
                return m.getKey();
        }
        return '$';
    }
}
