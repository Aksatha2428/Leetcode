class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int[] sum=new int[n];
        int s=0;
        for(int i=0;i<n;i++){
            s=s+nums[i];
            sum[i]=s;
        }
        return sum;
    }
}