class Solution {
    public int findJudge(int n, int[][] trust) {
        int arr[][]=new int[2][n+1];
        
        for(int a[]:trust){
            arr[0][a[0]]++;
            arr[1][a[1]]++;
        }
        
        int pos=-1;
        for(int i=1;i<=n;i++){
          if(arr[0][i]==0 && arr[1][i]==n-1) pos=i; 
        }
        return pos;
    }
}
