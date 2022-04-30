class Solution{
    String roundToNearest(String n){
        char c[]=n.toCharArray();
        int len=n.length()-1;
        
        int num=c[len]-'0';
        if(num<=5){
            c[len]='0';
            return new String(c);
        }
        else{
            c[len]='0';
            int div=1;
            for(int i=len-1;i>=0;i--){
                int val=c[i]-'0';
                int sum=val+div;
                int rem=sum%10;
                c[i]=(char)(rem + '0');
                div=sum/10;
            }
            String store=new String(c);
            if(div==1)
                return 1+store;
            else
                return store;
        }
    }
}
