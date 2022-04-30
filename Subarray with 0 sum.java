class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        //Your code here
        int i=0;
        int sum=0;
        Set<Integer> set=new HashSet<>();
        while(i<n){
            sum+=arr[i];
            if(sum==0||arr[i++]==0||set.contains(sum))
                return true;
            set.add(sum);
        }
        return false;
    }
}
