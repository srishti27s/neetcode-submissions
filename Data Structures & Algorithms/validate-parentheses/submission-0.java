
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Opening bracket: push onto stack
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } 
            else {
                // No opening bracket available to match
                if (st.isEmpty()) {
                    return false;
                }

                char top = st.peek();

                // Check whether the bracket types match
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }

                // Remove the matched opening bracket
                st.pop();
            }
        }

        // No unmatched opening brackets should remain
        return st.isEmpty();
    }
}
