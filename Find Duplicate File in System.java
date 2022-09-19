class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String,List<String>> store=new HashMap<>();
        
        for(String path:paths){
            String root[]=path.split(" ");
            String dir=root[0];
            
            for(int i=1;i<root.length;i++){
                String fileName=root[i].substring(0,root[i].indexOf("("));
                String content=root[i].substring(root[i].indexOf("(")+1, root[i].length()-1);
                
                List<String> filepath=store.getOrDefault(content,new ArrayList<>());
                filepath.add(dir+"/"+fileName);
                store.put(content,filepath);
            }
        }
        
        store.entrySet().removeIf(entry->entry.getValue().size()<=1);
        return new ArrayList<>(store.values());
        
    }
}
