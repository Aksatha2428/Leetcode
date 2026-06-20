class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        ArrayList <Character> a = new ArrayList<>();
        a.add('a');
        a.add('e');
        a.add('i');
        a.add('o');
        a.add('u');
        a.add('A');
        a.add('E');
        a.add('I');
        a.add('O');
        a.add('U');
        char[] arr =s.toCharArray();
        while(i<j){

            while(i<j&&!a.contains(arr[i])){
                i++;
            }
            while(i<j&&!a.contains(arr[j])){
                j--;
            }
            
            char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

                i++;
                j--;

        }
        return new String(arr);
    }
}