class Solution
{
   public int josephus(int n, int k)
    {
        //Your code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++)
            list.add(i);
        
        k=k-1;
        fun(list,0,k);
        return list.get(0);
    }
     void fun(ArrayList<Integer> list,int index,int k){
        if(list.size()==1)
            return;
        
        index=(index+k)%list.size();
        list.remove(index);
        fun(list,index,k);
    }
}
   
==========================================================================================================================================================================
   class Solution
{
   public int josephus(int n, int k)
    {
        //Your code here
    int res=0;
      for(int i=1;i<=n;i++){
         res=(res+k)%i;
         System.out.println("i=="+i);
         System.out.println("res=="+res);
      }
      return res+1;
    }
}
