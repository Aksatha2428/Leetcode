class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int k=nums[i];
            if(map.containsKey(k)){
                map.put(k,map.get(k)+1);
            }
            else{
                map.put(k,1);
            }
        }
        int max=1;
        int val=nums[0];
        for(Map.Entry<Integer,Integer>entry: map.entrySet()){
            if(max<entry.getValue()){
                val=entry.getKey();
                max=entry.getValue();
            }
        }
        return val;
    }
}