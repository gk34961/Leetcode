class Solution {
    public int maxPoints(int[][] points) {
        if(points.length==1) return 1;
        int max=0;
        for(int i=0;i<points.length;i++){
            for(int j=i+1;j<points.length;j++){
                int count=2;
                int y1=(points[j][1]-points[i][1]);
                int x1=(points[j][0]-points[i][0]);

                for(int k=0;k<points.length;k++){
                    if(k!=i &&k!=j){
                        int y2=(points[k][1]-points[i][1]);
                        int x2=(points[k][0]-points[i][0]);
                        if(y1*x2==x1*y2) count++;
                    }
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}
