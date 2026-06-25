class Solution {
    public String firstPalindrome(String[] words) {
        int n=words.length;
        for(int i=0;i<n;i++){
            if(isPalindrome(words[i])){
                return words[i];
            }
        }
        return "";
    }
    public boolean isPalindrome(String rev){
        int j=rev.length()-1;
        int i=0;
        while(i<j){
            if(rev.charAt(i)!=rev.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}