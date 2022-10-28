class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer>> stockBuySell(int a[], int n) {
        // code here
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        int start=0;
        int end=0;
        
        for(int i=1;i<n;i++){
            if(a[i-1]<a[i]) end=i;
            else{ 
                if(start<end){
                    ArrayList<Integer> list=new ArrayList<Integer>();
                    list.add(start);
                    list.add(end);
                    result.add(list);
                }
            start=i;
            }
        }
        
        if(start<end){
            ArrayList<Integer> list=new ArrayList<Integer>();
            list.add(start);
            list.add(end);
            result.add(list);
        }
        
        //System.out.println(result);
        return result;
    }
}
