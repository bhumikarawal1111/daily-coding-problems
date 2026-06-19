import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0 ; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else{
                //corner case - where closing brackets are more than opening
                if(st.isEmpty()){
                    return false;
                }
                //stack not empty 
                char top = st.pop();
                //check if incoming char is == to top
                //if not return false
                if(
                    (ch == ')' && top!='(') ||
                    (ch == '}' && top!='{') ||
                    (ch == ']' && top!='[') 
                ){
                    return false;
                }
            }
        }
    //loop completes then-
    return st.isEmpty();  //true-valid //false- invalid
        
    }
}
