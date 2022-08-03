class MyCalendar {

    TreeMap<Integer,Integer> map;
    public MyCalendar() {
       map=new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        Integer lowerKey=map.lowerKey(end);
        if(lowerKey==null || map.get(lowerKey)<=start){
            map.put(start,end);
            return true;
        }
           return false;
    }
}
