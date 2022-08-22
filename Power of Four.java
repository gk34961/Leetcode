class Solution {
    public boolean isPowerOfFour(int num) {
        return (Math.log(num) / Math.log(4)) % 1 == 0;
    }
}

/*
class Solution {
    public boolean isPowerOfFour(int n) {
   
       if(n==0){
           return false; 
        }
        if (n==1){
            return true ;
        }
        if (n%4!=0){
            return false;
        }
        return isPowerOfFour(n/4);
    }
}
*/
