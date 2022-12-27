class Solution{
    static int minJumps(int[] arr){
        if(arr.length<=1) return 0;
        if(arr[0]==0) return -1;
        // your code here
        int nextReachable=arr[0];//2
        int stepCount=arr[0];   //2
        int jump=1;
        
        for(int i=1;i<arr.length;i++){
            if(i==arr.length-1) return jump;
            stepCount=stepCount-1;
            nextReachable=Math.max(nextReachable,i+arr[i]);
            
            
            if(stepCount==0){
                jump++;
                if(nextReachable<=i) return -1;
                stepCount=nextReachable-i;
            }
        }
        return -1;
    }
}
