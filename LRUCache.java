class LRUCache {
    
    public LinkedHashMap<Integer, Integer> lhm;
    public int capacity;
    
    public LRUCache(int capacity) {
        this.lhm = new LinkedHashMap<Integer, Integer>(capacity);
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(this.lhm.containsKey(key)) {
            int retval = this.lhm.get(key);
            this.lhm.remove(key);
            this.lhm.put(key, retval);
            return retval;
        }
        return -1;
    }
    
    public void set(int key, int val) {
        
        if(this.lhm.containsKey(key)) {
            this.lhm.remove(key);
        } else if(this.lhm.size() == this.capacity) {
            int firstkey = this.lhm.entrySet().iterator().next().getKey();
            this.lhm.remove(firstkey);
        }
        this.lhm.put(key, val);
    }
}
