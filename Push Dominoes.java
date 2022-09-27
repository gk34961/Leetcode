class Solution {
    public String pushDominoes(String dominoes) {
        int right[]=new int[dominoes.length()];
        int left[]=new int[dominoes.length()];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<dominoes.length();i++){
            if(dominoes.charAt(i)=='R') right[i]=dominoes.length();
            else if(dominoes.charAt(i)=='L') right[i]=0;
            else if(dominoes.charAt(i)=='.' && i>0) right[i]=Math.max(0,right[i-1]-1);
            else if(dominoes.charAt(i)=='.' && i==0) right[i]=0;
        }
        
        for(int i=dominoes.length()-1; i>=0;i--){
            if(dominoes.charAt(i)=='L') left[i]=dominoes.length();
            else if(dominoes.charAt(i)=='R') left[i]=0;
            else if(dominoes.charAt(i)=='.' && i<dominoes.length()-1) left[i]=Math.max(0,left[i+1]-1);
            else if(dominoes.charAt(i)=='.' && i==dominoes.length()-1) left[i]=0;
        }
        
        for(int i=0;i<dominoes.length();i++){
            if(right[i]-left[i]==0) sb.append('.');
            else if(right[i]-left[i]>0) sb.append('R');
            if(right[i]-left[i]<0) sb.append('L');
        }
        
        return sb.toString();
    }
}
