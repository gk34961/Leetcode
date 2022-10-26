class Solution {
    ArrayList<Integer> find3Numbers(ArrayList<Integer> arr, int n) {
        // add code here.
        
        ArrayList<Integer>list=new ArrayList<>();
        if(n<3)  return list;
        ArrayList<Integer> result=new ArrayList<>();
        int minLeft[]=new int[n];
        int maxRight[]=new int[n];
        
        minLeft[0]=arr.get(0);
        maxRight[n-1]=arr.get(n-1);
        
        for(int i=1;i<n;i++) minLeft[i]=Math.min(arr.get(i),minLeft[i-1]);
        for(int i=n-2;i>=0;i--) maxRight[i]=Math.max(arr.get(i),maxRight[i+1]);
        
        for(int i=0;i<n;i++){
            if(minLeft[i]<arr.get(i) && arr.get(i)<maxRight[i]){
                result.add(minLeft[i]);
                result.add(arr.get(i));
                result.add(maxRight[i]);
                return result;
            }
        }
        return result;
    }
}
