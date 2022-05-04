class Solution
{
    ArrayList<Integer> countDistinct(int arr[], int n, int k)
    {
        // code here 
        int i=0;
        int j=0;
        Map<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<Integer>();
       
        
        while(j<n){
            map.put(arr[j], map.getOrDefault(arr[j],0)+1);
            if((j-i)==k-1){
                list.add(map.size());
                int temp=map.getOrDefault(arr[i],0);
                if(temp==1) map.remove(arr[i]);
                else if(temp>1) map.put(arr[i], map.get(arr[i])-1);
                i++;
            }
            j++;
        }
        return list;
    }
}
