class Solution {
    public boolean isValid(String s) {
       Stack<Character> st = new Stack<>();
       for(char p: s.toCharArray()){
            if(p=='('){
                st.push(')');
            }
            else if(p=='{'){
                st.push('}');
            }
            else if(p=='['){
                st.push(']');
            }
            else{
                if(st.isEmpty() || st.pop()!=p){
                    return false;
                }
            }
       }
       return st.isEmpty();

    }
}