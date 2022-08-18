class Solution {
    public int minSetSize(int[] arr) {
        int len=arr.length;
        int remaining=len;
        Map<Integer,Integer> map=new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        
        List<Integer>list=map.values().stream().collect(Collectors.toList());
        Collections.sort(list,Collections.reverseOrder());
        
        int index=0;
        while(remaining>len/2){
            remaining-=list.get(index);
            index++;
        }
        return index;
    }
}
