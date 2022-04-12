
import java.util.*;
import java.util.stream.Collectors;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) {
       Scanner sc=new Scanner(System.in);
       int testCase=sc.nextInt();
       for(int i=0;i<testCase;i++){
           int tc=sc.nextInt();
           Integer arr[]=new Integer[tc];
           for(int j=0;j<tc;j++){
               arr[j]=sc.nextInt();
           }
           Integer[] ans = SortFrequency(arr);
           
           for(Integer ele : ans) {
               System.out.print(ele + " ");
           }
           System.out.println();
       }
   }
	 
	public static Integer[] SortFrequency(Integer[] arr) {
       HashMap<Integer, Integer> map = new HashMap<>();
       for(Integer ele : arr)
           map.put(ele, map.getOrDefault(ele, 0) + 1);
       
       Arrays.sort(arr, (a, b)-> {
           if(map.get(a) == map.get(b)) {
               return a - b;
           }
           return map.get(b) - map.get(a);
       });
       
       return arr;
   }
}