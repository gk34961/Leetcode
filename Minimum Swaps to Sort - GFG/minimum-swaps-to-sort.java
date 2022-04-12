// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int[] nums = new int[n];
            String[] S = br.readLine().trim().split(" ");
            for(int i = 0; i < n; i++){
                nums[i] = Integer.parseInt(S[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minSwaps(nums);
            System.out.println(ans);
       }
    }
}// } Driver Code Ends




class Solution
{
 public int minSwaps(int nums[]) {
		int n = nums.length;
		//Duplicate array
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = nums[i];
		//duplicate array sorted
		Arrays.sort(a);
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < n; i++)
			hm.put(a[i], i);//sorted array element with position put in Map
		
		int count = 0;
		for (int i = 0; i < n; i++) {
			while (hm.get(nums[i]) != i) {
				count++;
				swap(nums, hm.get(nums[i]), i);
			}
		}
		return count;
	}

	static void swap(int a[], int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}  
}