class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        boolean one=false;
        for(int i=0;i<size;i++){
            if(arr[i]==1) one=true;
            if(arr[i]<1 ||size<arr[i])
                arr[i]=1;
        }
        
        if(one==false) return 1;
        
        for(int i=0;i<size;i++){
           int index= Math.abs(arr[i]);
           arr[index-1]=-Math.abs(arr[index-1]);
        }
        
        for(int i=0;i<size;i++){
           if(arr[i]>0) return i+1;
        }
        return size+1;
    }
}
