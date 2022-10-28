class Solution{
    static long trappingWater(int arr[], int n) { 
        // Your code here
        int ngl[]=new int[n];
		int ngr[]=new int[n];
		
		int index=0;
		Stack<Integer> stack=new Stack<>();
		ngl[0]=arr[0];
		for(int i=1;i<n;i++)    ngl[i]=Math.max(ngl[i-1],arr[i]);
		
		ngr[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--) ngr[i]=Math.max(ngr[i+1],arr[i]);
		
		int water[]=new int[n];
		for(int i=0;i<n;i++)    water[i]=Math.min(ngr[i], ngl[i])-arr[i];
		
		long sum=0;
		for(int i=0;i<n;i++)    sum+=water[i];
		
		return sum;
    } 
}

class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        int leftMax[]=new int[n];
        int rightMax[]=new int[n];
        
        leftMax[0]=arr[0];
        rightMax[n-1]=arr[n-1];
        
        for(int i=1;i<n;i++) leftMax[i]=Math.max(leftMax[i-1],arr[i]);
        for(int i=n-2;i>=0;i--) rightMax[i]=Math.max(rightMax[i+1],arr[i]);
        long result=0;
        for(int i=0;i<n;i++){
            int min=Math.min(leftMax[i],rightMax[i]);
            result+=min-arr[i];
        }
        return result;
    } 
}
