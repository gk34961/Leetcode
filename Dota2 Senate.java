class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> dire=new LinkedList<>();
        Queue<Integer> radiant=new LinkedList<>();
        int count=senate.length();

        for(int i=0;i<senate.length();i++){
            if(senate.charAt(i)=='D') dire.add(i);
            else radiant.add(i);
        }

        while(!dire.isEmpty() && !radiant.isEmpty()){
            int one=dire.poll();
            int two=radiant.poll();

            if(one<two) dire.add(count);
            
            if(two<one) radiant.add(count);
            
            count++;
        }

        return dire.isEmpty()?  "Radiant":"Dire";
    }
}
