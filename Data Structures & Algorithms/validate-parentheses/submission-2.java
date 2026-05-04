class Solution {
    public boolean isValid(String s) {
        // using stack without map

        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty())
                    return false;
                if (stack.peek() == '{' && c == '}' || stack.peek() == '[' && c == ']'
                    || stack.peek() == '(' && c == ')' ){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
            }
        }
        return stack.isEmpty();
    }
}
