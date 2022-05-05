class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here 
    	Stack<Integer> stack=new Stack<>();
    	for(int i=0;i<n;i++)
    	    stack.push(i);
    	    
    	while(stack.size()>=2){
    	    int one=stack.pop();
    	    int two=stack.pop();
    	    
    	    if(M[one][two]==1)
    	        stack.push(two);
    	    else
    	       stack.push(one); 
    	}
    	
    	if(stack.empty())
            return -1;
        int left=stack.pop();
        
        for (int i = 0; i < n; i++){
            
            if (i != left && ((M[left][i]==1) ||M[i][left]==0))
                return -1;
        }
       
    	return left;
    }
}

=======================================================================================================================================================================
  
  class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int arr[][], int n)
    {
    	// code here 
    	int i=0;
    	int j=n-1;
    	
    	while(i<j){
    	    if(arr[i][j]==1) i++;
    	    else j--;
    	}
    	
        int left=i;
        for (int t = 0; t < n; t++){
            if (t != left && ((arr[left][t]==1) ||arr[t][left]==0))
                return -1;
        }
    	return left;
    }
}
