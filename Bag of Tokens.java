class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        
        int score=0;
        int start=0;
        int end=tokens.length-1;
        int res=0;
        while(start<=end){
            if(tokens[start]<=power){
                score++;
                power-=tokens[start];
                start++;
            }
            else if(score>0){
                score--;
                power+=tokens[end];
                end--;
            }
            else
                break;
            res=Math.max(res,score);
        }
        return res;
    }
}
