class Solution {
    public int findNumbers(int[] nums) {
        int eve=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int l=nums[i];
            int dig=0;
            while(l>0){
                dig++;
                l/=10;
            }
            if(dig%2==0){
                eve++;
            }
        }
        return eve;
    }
}