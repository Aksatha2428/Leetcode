class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s2.length();
        int k=s1.length();
        if(n<k){
            return false;
        }
        HashMap<Character,Integer>nmap=new HashMap<>();
        for(int i=0;i<k;i++){
            char key=s1.charAt(i);
            if(nmap.containsKey(key)){
                nmap.put(key,nmap.get(key)+1);
            }
            else{
                nmap.put(key,1);
            }
        }
        HashMap<Character,Integer>kmap= new HashMap<>();
        for(int i=0;i<k;i++){
            char key=s2.charAt(i);
            if(kmap.containsKey(key)){
                kmap.put(key,kmap.get(key)+1);
            }
            else{
                kmap.put(key,1);
            }
        }
        if(nmap.equals(kmap)){
            return true;
        }
        for(int i=1;i<=n-k;i++){
            char ch=s2.charAt(i-1);
            if(kmap.get(ch)>1){
                kmap.put(ch,kmap.get(ch)-1);
            }
            else{
                kmap.remove(ch);
            }
            char key=s2.charAt(i+k-1);
            if(kmap.containsKey(key)){
                kmap.put(key,kmap.get(key)+1);
            }
            else{
                kmap.put(key,1);
            }
            if(nmap.equals(kmap)){
                return true;
            }
        }
        return false;
    }
}