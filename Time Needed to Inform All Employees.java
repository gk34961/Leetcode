class Solution
{
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) 
    {
        if(informTime.length == 1 )//base case
            return informTime[0];
        
        HashMap<Integer, ArrayList<Integer>> map= new HashMap<>();
        
        for(int i= 0; i< manager.length; i++)
        {
            map.putIfAbsent(manager[i], new ArrayList<Integer>());
            if(manager[i] == -1) continue;
            ArrayList<Integer> get= map.get(manager[i]);
            get.add(i);
            map.put(manager[i], get);
        }
        return dfs(map, informTime, headID);
    }
    private int dfs(HashMap<Integer, ArrayList<Integer>> map, int[] informTime, int id)
    {
        int max= 0;
        if(map.get(id) != null){
           for(int subID: map.get(id))
                  max= Math.max(max, dfs(map, informTime, subID)+informTime[id]);
        }
        return max;
    }
}
