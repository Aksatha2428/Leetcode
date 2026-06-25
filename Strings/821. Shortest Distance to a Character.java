class Solution {
    public int[] shortestToChar(String s, char c) {
       int n=s.length();
       int [] arr= new int[n];
       ArrayList <Integer> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)==c){
                a.add(i);
            }
        }
        for(int i=0;i<n;i++){
            int min=Integer.MAX_VALUE;
            for(int x:a){
                int l=i-x;
                if(l<0){
                    l=-l;
                }
                min=Math.min(min,l);
            }
            arr[i]=min;
        }
        return arr;
    }
}