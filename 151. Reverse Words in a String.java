class Solution {
    public String reverseWords(String s) {
        String[] arr= s.trim().split("\\s+");
        String[] rev= new String[arr.length];
        for(int i=0;i<arr.length;i++){
            rev[arr.length-i-1]=arr[i];
        }
        String reverse=String.join(" ",rev);
        return reverse;

    }
}
