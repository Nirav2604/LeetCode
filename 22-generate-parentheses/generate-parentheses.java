class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        makeParentheses(answer, "", 0, 0, n);
        return answer;
    }
    public void makeParentheses(List<String> answer,String current,int open,int close,int n){
        if (current.length() == n * 2) {
            answer.add(current);
            return;
        }
        if (open < n) {
            makeParentheses(answer,current + "(",open + 1,close,n);
        }
        if (close < open) {
            makeParentheses(answer,current + ")",open,close + 1,n);
        }
    }
}