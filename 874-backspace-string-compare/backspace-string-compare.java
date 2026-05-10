class Solution {
    public boolean backspaceCompare(String s, String t) {
       return function(s).equals(function(t));
    }
    private Stack function(String s){
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
           if(c != '#'){
            st.push(c);
           }
           else if(!st.isEmpty()){
            st.pop();
           }
        }
        return st;
    }
}