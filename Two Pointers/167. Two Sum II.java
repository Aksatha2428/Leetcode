class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int j=numbers.length-1;
        int[] arr=new int[2];
        int i=0;
        while(i<=j){
            if(numbers[j]+numbers[i]==target){
                arr[0]=i+1;
                arr[1]=j+1;
                break;
            }
            else if(numbers[i]+numbers[j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        return arr;
    }
}