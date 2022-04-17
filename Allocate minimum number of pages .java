class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        //Your code here
        if(N<M) return -1;
        Arrays.sort(A);
        int end=0;
        
        for(int i=0;i<N;i++)
            end+=A[i];
            
        int start=A[N-1];
        int result=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(isValid(A,N,M,mid)==true){
                result=mid;
                end=mid-1;
            }
            else
                start=mid+1;
        }
        return result;
    }
    
    static boolean isValid(int arr[],int n,int k,int mid){
        int student=1;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>mid){
                student++;
                sum=arr[i];
            }
        }
        if(student>k) return false;
        else return true;
    }
};
