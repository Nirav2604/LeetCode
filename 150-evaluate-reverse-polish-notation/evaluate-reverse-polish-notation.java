class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (!token.equals("+") && !token.equals("-") && !token.equals("*") && !token.equals("/"))
            {
                stack.push(Integer.parseInt(token));
            }
            else {
                int second = stack.pop();
                int first = stack.pop();
                int result = 0;
                if (token.equals("+")) {
                    result = first + second;
                }
                else if (token.equals("-")) {
                    result = first - second;
                }
                else if (token.equals("*")) {
                    result = first * second;
                }
                else if (token.equals("/")) {
                    result = first / second;
                }
                stack.push(result);
            }
        }
        return stack.pop();
    }
}