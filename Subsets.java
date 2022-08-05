class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        findAllSubset(nums,list,result,0);
        return result;
    }
    void findAllSubset(int[] nums,List<Integer> list,List<List<Integer>> result,int start){
            result.add(new ArrayList<>(list));
        
            for(int i=start;i<nums.length;i++){
                list.add(nums[i]);
                findAllSubset(nums,list,result,i+1);
                list.remove(list.size()-1);
            }
    }
}
