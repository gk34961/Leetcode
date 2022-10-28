class Solve {
    int[] findTwoElement(int arr[], int n) {
        // code here
        int res[]=new int[2];
        
        for(int i=0;i<n;i++){
            int index=Math.abs(arr[i]);
            if(arr[index-1]>0) 
                arr[index-1]=-arr[index-1];
            else
                res[0]=index;
        }
        
        for(int i=0;i<n;i++)
            if(arr[i]>0) res[1]=i+1;
        return res;
    }
}
