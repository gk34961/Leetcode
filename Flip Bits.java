class Solution {

    public static int maxOnes(int a[], int n) {
        int sum=0, maxsum=0, total=0;
        
        for (int i=0; i<n; i++){
           int curr = a[i];
           total += a[i];
           if (curr == 0){
               curr=1;
           }
           else{
               curr=-1;
           }
           sum += curr;
           if(sum<0) sum=0;
           maxsum = Math.max(sum, maxsum);
        }
       return (total+maxsum);
        
    }
}
