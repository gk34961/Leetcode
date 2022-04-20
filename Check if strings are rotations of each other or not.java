class Solution
{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 )
    {
        {
       boolean res = false;
       if(s1.length()!=s2.length()) return false;
       if(s1.equals(s2)){
           res = true;
       }
       for(int i=1 ; i<s1.length() ; i++){
           String s = s1.substring(i,s1.length()) + s1.substring(0,i);
           System.out.println(s);
           if(s.equals(s2)) {
               res = true;
               break;
           }
       }
       return res;
        }
   }
}
