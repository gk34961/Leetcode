class Solution {
    public int maxProduct(String[] words) {
        
        int n = words.length;
        
        int res = 0;
        int[] masks = new int[n];
        
        for(int i = 0 ; i < n ; i++) 
            masks[i] = getMask(words[i]);
        
        
        for(int i = 0 ; i < n ; i++) {
            for(int j = i + 1 ; j < n ; j++) {
                if((masks[i] & masks[j]) == 0)
                    res = Math.max(res , words[i].length() * words[j].length());
            }
        }
        
        return res;
    }
    
    public int getMask(String s) {
        int mask = 0;
        
        for(int i = 0 ; i < s.length() ; i++) {
            char c = s.charAt(i);  
            mask = mask | (1 << (c - 'a'));
            
        }
        System.out.println("mask="+mask);
        return mask;
    }
}
