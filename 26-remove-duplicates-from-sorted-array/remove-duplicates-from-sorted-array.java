class Solution {
    public int removeDuplicates(int[] num) {
        int i,k=1;
        for(i=0;i<num.length;i++){
            if(num[i]==num[k-1]){
                continue;
            }
            else{
                num[k]=num[i];
                k++;
            }
        }
        return k;
    }
}