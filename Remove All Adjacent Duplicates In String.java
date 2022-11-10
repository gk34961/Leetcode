class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(stack.isEmpty()) stack.add(s.charAt(i));
            else if(stack.peek()!=s.charAt(i)) stack.add(s.charAt(i));
            else{
                while(!stack.isEmpty() && stack.peek()==s.charAt(i)) stack.pop();
            }
        }

        while(!stack.isEmpty()) sb.append(stack.pop());

        return sb.reverse().toString();
    }
}
