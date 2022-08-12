class Solution {
    public static String kthPermutation(int n,int k) {
        // code here
        List<Integer> arr=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        int fact=1;
        for(int i=1;i<=n;i++){
            arr.add(i);
            fact*=i;
        }
        
        k--;
        
        for(int i=0;i<n;i++){
            fact/=(n-i);
            int index=k/fact;
            sb.append(arr.remove(index));
            k-=(index*fact);
        }
        return sb.toString();
    }
}
        
