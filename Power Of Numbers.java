class Solution
{
        
    long power(int N,int R)
    {
        //Your code here
        int m = 1000000007;
        if(R==1 || R<=1) return N;
        long result=power(N,R/2);
        if(R%2==0)
            return result%m *result%m;
        return N*result%m*result%m;
    }
}
