class Solution
{
    //Function to return a list of indexes denoting the required 
    //combinations whose sum is equal to given number.
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B)
    {
        // add your code here
        
        HashSet<Integer> set=new HashSet<>(A);
        ArrayList<Integer> list=new ArrayList<>(set);
        Collections.sort(list);
        
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        backtrack(list,B,new ArrayList<>(),result,list.get(0));
        return result;
    }
static void backtrack(ArrayList<Integer> list, int target,ArrayList<Integer> l,ArrayList<ArrayList<Integer>> result,int prv){
        if(target<0) return;
        if(target==0){
            result.add(new ArrayList<>(l));
            return;
        }
        
        for(int i=0;i<list.size();i++){
            if(prv<=list.get(i)){
            l.add(list.get(i));
            backtrack(list,target-list.get(i),l,result,list.get(i));
            l.remove(l.size()-1);
            }
        }
    }
}
