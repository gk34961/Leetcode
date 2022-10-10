class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length()<=1) return "";
        char c[]=palindrome.toCharArray();
        
        if(c[0]!='a'){
            c[0]='a';
            return String.valueOf(c);
        }
        boolean check=false;
        for(int i=1;i<palindrome.length()/2;i++){
            if(c[i]!='a' && !check) {
                c[i]='a';
                check=true;
            }
        }
        
        if(!check)
            c[palindrome.length()-1]='b';
        return String.valueOf(c);
    }
}
