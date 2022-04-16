// { Driver Code Starts
import java.util.Scanner;

class SquartRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			Solution obj = new Solution();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
	}
}// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution
{
     long floorSqrt(long x)
	 {
	    Double d= Math.sqrt(x);
	    return d.longValue();
	 }
}

class Solution
{
     long floorSqrt(long x)
	 {
	    if(x==1) return 1;
	    long l=0;
	    long r=x;
	    
	    long sqroot=1;
	    while(l<=r){
	        long mid=(l+r)/2;
	        if(mid*mid>x)
	            {r=mid-1;}
	        else{
	            l=mid+1;sqroot=mid;}
	    }
	 return sqroot;
	 }
}

