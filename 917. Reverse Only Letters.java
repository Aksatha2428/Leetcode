class Solution {
    public String reverseOnlyLetters(String s) {
        int n=s.length();
        char arr[]=s.toCharArray();
        int j=arr.length-1;
        int i=0;
        while(i<j){
            while(i<j && !isLetter(arr[i])){
                i++;
            }
            while(i<j && !isLetter(arr[j])){
                j--;
            }
            char temp= arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;        
        }
        return new String(arr);
    }
    public boolean isLetter(char a){
        if((a>='a'&&a<='z')||(a>='A'&&a<='Z')){
            return true;
        }
            return false;
    }
}