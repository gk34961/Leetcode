class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        
        //row
        for(int i=0;i<r;i++){
            countSort(mat,i,0,r,c);
        }
        //col
        for(int i=1;i<c;i++){
            countSort(mat,0,i,r,c);
        }
        return mat;
    }
    void countSort(int mat[][],int sr,int sc,int mr,int mc){
        List<Integer> list=new ArrayList<>();
        int i=sr;
        int j=sc;
        
        while(i<mr && j<mc){
            list.add(mat[i][j]);
            i++;
            j++;
        }
        
        Collections.sort(list);
        
        i=sr;
        j=sc;
        int index=0;
        while(i<mr && j<mc){
            mat[i][j]=list.get(index);
            index++;
            i++;
            j++;
        }       
    }
}
