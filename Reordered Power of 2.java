class Solution {
    public boolean reorderedPowerOf2(int n) {
        int frequencyOfNumber[]=findFrequency(n);
        for(int i=0;i<31;i++){
            int squreOftwo=(int)Math.pow(2,i);
            int frqOfSqr[]=findFrequency(squreOftwo);
            if(compareFrq(frequencyOfNumber,frqOfSqr)) return true;
        }
        return false;
    }
    boolean compareFrq(int frq1[],int frq2[]){
        for(int i=0;i<10;i++){
            if(frq1[i]!=frq2[i]) return false;
        }
         return true;   
    }
    int[] findFrequency(int n){
        int freq[]=new int[10];
        while(n>0){
            freq[n%10]++;
            n/=10;
        }
        return freq;
    }
}
