class Solution {
    public boolean isValid(String s) {
        // using stack

        Map<Character, Character> bMap = new HashMap<>();
        bMap.put(')', '(');
        bMap.put('}', '{');
        bMap.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (bMap.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == bMap.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
