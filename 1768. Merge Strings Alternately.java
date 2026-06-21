class Solution {
    public String mergeAlternately(String word1, String word2) {
       int i=word1.length();
       int j=word2.length();
       char[] arr=new char[i+j];
       i=j=0;
       int k=0;
        while(i<word1.length()&&j<word2.length()){
            arr[k]=word1.charAt(i);
            arr[k+1]=word2.charAt(j);
            k+=2;
            i++;
            j++;
        }
        while(i<word1.length()){
            arr[k++]=word1.charAt(i++);
        }
        while(j<word2.length()){
            arr[k++]=word2.charAt(j++);
        }
        return new String(arr);
    }
}