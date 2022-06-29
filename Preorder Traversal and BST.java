class Solution {
    static int canRepresentBST(int arr[], int n) {
        // code here
        Stack<Integer> st=new Stack<>();
        int root=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            
            if(arr[i]<root) return 0;
            while(!st.isEmpty() && arr[i]>st.peek()){
                root=st.peek();
                st.pop();
            }
            st.push(arr[i]);
        }
        return 1;
    }
}
