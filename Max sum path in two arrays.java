class Solution
{
    int maxPathSum(int ar1[], int ar2[])
    {
        // Your code here
        int one=ar1.length;
        int two=ar2.length;
        int sum1=0;
        int sum2=0;
        int max=0;
        int i=0;
        int j=0;
        
        while(i<one && j<two){
            if(ar1[i]<ar2[j]){
                sum1+=ar1[i];
                i++;
            }
            else if(ar1[i]>ar2[j]){
                sum2+=ar2[j];
                j++;
            }
            else{
               max+=Math.max(sum1,sum2);
               sum1=0;
               sum2=0;
               
               while(i<one && j<two && ar1[i]==ar2[j]){
                   max+=ar1[i];
                   i++;
                   j++;
               }
            }
        }
        
        if(i==one)
        while(j<two) sum2+=ar2[j++];
        
        if(j==two)
        while(i<one) sum1+=ar1[i++];
        
        max+=Math.max(sum1,sum2);
        return max;
    }
}
