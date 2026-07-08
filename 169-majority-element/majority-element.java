class Solution {
    public int majorityElement(int[] nums) {
        int i,k=0,count=0;
        k=nums[0];
        for(i=0;i<nums.length;i++){
            if(count==0){
                k=nums[i];
            }
            if(nums[i]==k){
                count++;
            }else{
                count--;
            }
        }
        return k;
    }
}