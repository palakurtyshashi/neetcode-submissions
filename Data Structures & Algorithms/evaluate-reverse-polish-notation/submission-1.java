class Solution {
    public int evalRPN(String[] tokens) {
        // using recursion
        List<String> tokenlist = new ArrayList<>(Arrays.asList(tokens));
        return dfs(tokenlist);
    }
    public int dfs(List<String> tlist) {
        String token = tlist.remove(tlist.size() - 1);

        if (!"/*+-".contains(token)) {
            return Integer.parseInt(token);
        }
        int right = dfs(tlist);
        int left = dfs(tlist);

        switch (token) {
            case "+":
                return left + right;
            case "-":
                return left - right;
            case "*":
                return left * right;
            case "/":
                return left / right;
        }
        return 0;
    }
}
