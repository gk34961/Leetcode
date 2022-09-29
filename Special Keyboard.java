class Solution{
    static int store[]=new int[77];
    static int optimalKeys(int n){
        // code here
        if(n<=6) return store[n]= n;
        if(store[n]!=0) return store[n];
        
        int one=2*optimalKeys(n-3);
        int two=3*optimalKeys(n-4);
        int three=4*optimalKeys(n-5);
        int four=5*optimalKeys(n-6);
        
        return store[n]=Math.max(one,Math.max(two,Math.max(three,four)));
    }
}
