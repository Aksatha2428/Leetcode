class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n=nums.length;
        HashSet<Integer> h1= new HashSet<>();
        for(int i=0;i<n;i++){
            if(h1.contains(nums[i])){
                return true;
            }
            else{
                h1.add(nums[i]);
            }
        }
        return false;
    }
}