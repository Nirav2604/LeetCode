class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int left = 0;
        int right = n - 1;
        int position = n - 1;
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            if (leftSquare > rightSquare) {
                answer[position] = leftSquare;
                left++;
            } else {
                answer[position] = rightSquare;
                right--;
            }
            position--;
        }
        return answer;
    }
}