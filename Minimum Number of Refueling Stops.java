class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int dCovered=startFuel;
        int count=0;
        int index=-1;
        int lastIndex=-1;
        while(dCovered<target){
            startFuel=0;
            
            
            for(int i=0;i<stations.length;i++){
                if(stations[i][0]<=dCovered && startFuel<stations[i][1]){
                    startFuel=stations[i][1];
                    index=i;
                    
                }
            }
            if(index==lastIndex) return -1;
            count++;
            lastIndex=index;
            
            dCovered+=startFuel;
            if(index!=-1)
                stations[index][1]=-1;
        }
        
        return count;
    }
}
