class Solution
{
    
    String UncommonChars(String str1, String str2)
    {
        int present[] = new int[26];
 
        for (int i = 0; i < str1.length(); i++)
            present[str1.charAt(i) - 'a'] = 1;
        
 
        for (int i = 0; i < str2.length(); i++){
            if (present[str2.charAt(i) - 'a'] == 1 || present[str2.charAt(i) - 'a'] == -1)
                present[str2.charAt(i) - 'a'] = -1;
            else
                present[str2.charAt(i) - 'a'] = 2;
            }
 
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            char c=(char)(97+i);
            if(present[i]==1 ||present[i]==2)
                sb.append(c);
        }
        return sb.length() == 0? "-1":sb.toString();
    }
}
