class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int length = 1; length <= n / 2; length++) {
            if (n % length != 0) {
                continue;
            }
            boolean same = true;
            for (int i = length; i < n; i++) {
                if (s.charAt(i) != s.charAt(i % length)) {
                    same = false;
                    break;
                }
            }
            if (same) {
                return true;
            }
        }
        return false;
    }
}