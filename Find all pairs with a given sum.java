class Solution {
    public pair[] allPairs( long A[], long B[], long N, long M, long x) {
        // Your code goes here 
        Arrays.sort(A);
        Arrays.sort(B);
        //Point to remember
        ArrayList<pair> ans = new ArrayList<pair>();
        
        
        int i=0;
        while(i<N && M>0){
            if(A[i]+B[(int)M-1]==x) {ans.add(new pair(A[i], B[(int)M-1])); i++;M--;}
            else if(A[i]+B[(int)M-1]<x) i++;
            else
                M--;
        }
        int n = ans.size();
       // System.out.println(ans);
        pair p[] = new pair[n];
        
        for(int j=0;j<n;j++){
           p[j] = new pair(ans.get(j).first , ans.get(j).second);
        } 
          return p;
    }
}
