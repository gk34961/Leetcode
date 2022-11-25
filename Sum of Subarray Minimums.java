class Pair{
    int ele;
    int count;
    Pair(int ele,int count){
        this.ele=ele;
        this.count=count;
    }
}
class Solution {
    public int mod = (int)1e9 + 7;
    public int sumSubarrayMins(int[] arr) {
        long left[]=new long[arr.length];
        long right[]=new long[arr.length];

        Stack<Pair> s1=new Stack<>();
        Stack<Pair> s2=new Stack<>();

//filling left
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            int count=1;
            while(s1.size()!=0 && s1.peek().ele>current){
                count+=s1.peek().count;
                s1.pop();
            }

            s1.push(new Pair(current,count));
            left[i]=count;
        }

//filling right
        for(int i=arr.length-1;i>=0;i--){
            int current=arr[i];
            int count=1;
            while(s2.size()!=0 && s2.peek().ele>=current){
                count+=s2.peek().count;
                s2.pop();
            }

            s2.push(new Pair(current,count));
            right[i]=count;
        }
        long result=0;
        for(int i=0;i<arr.length;i++)
            result=(result+arr[i]*left[i]*right[i])%mod;
        return (int)result;
    }
}
