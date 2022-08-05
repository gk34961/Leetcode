class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        findAllSubset(nums,list,result,0);
        return result;
    }
    void findAllSubset(int[] nums,List<Integer> list,List<List<Integer>> result,int start){
            result.add(new ArrayList<>(list));
        
            for(int i=start;i<nums.length;i++){
                if(i>start && nums[i]==nums[i-1]) continue;
                list.add(nums[i]);
                findAllSubset(nums,list,result,i+1);
                list.remove(list.size()-1);
            }
    }
}
