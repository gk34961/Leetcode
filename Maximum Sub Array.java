class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int arr[], int n) { 
        
        // Your code here
        int leftMin[]=new int[n];
        int rightMax[]=new int[n];
        
       leftMin[0]=arr[0];
       rightMax[n-1]=arr[n-1];
       
       for(int i=1;i<n;i++) leftMin[i]=Math.min(leftMin[i-1],arr[i]);
       for(int i=n-2;i>=0;i--) rightMax[i]=Math.max(rightMax[i+1],arr[i]);
       
       int i=0;
       int j=0;
       int max=0;
       while(i<n &&j<n){
          if(leftMin[i]<=rightMax[j]){
              max=Math.max(max,j-i);
              j++;
          }
          else i++;
       }
        return max;
    }
}
