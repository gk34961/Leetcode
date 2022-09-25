class Solution {
    public int concatenatedBinary(int n) {
        int modulo=1000000007;
        long res=0;
        int size=0;
        for(int i=1;i<=n;i++){
            if((i&(i-1))==0) size++;
            res=(res<<size|i)%modulo;
        }
        return (int)res;
    }
}
