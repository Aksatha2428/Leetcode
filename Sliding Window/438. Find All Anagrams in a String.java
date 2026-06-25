class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int k = p.length();

        List<Integer> list = new ArrayList<>();

        if (n < k) {
            return list;
        }

        HashMap<Character, Integer> kmap = new HashMap<>();
        HashMap<Character, Integer> nmap = new HashMap<>();

        for (int i = 0; i < k; i++) {
            kmap.put(p.charAt(i),
                    kmap.getOrDefault(p.charAt(i), 0) + 1);

            nmap.put(s.charAt(i),
                    nmap.getOrDefault(s.charAt(i), 0) + 1);
        }

        if (kmap.equals(nmap)) {
            list.add(0);
        }

        for (int i = 1; i <= n - k; i++) {

            char left = s.charAt(i - 1);

            if (nmap.get(left) > 1) {
                nmap.put(left, nmap.get(left) - 1);
            } else {
                nmap.remove(left);
            }

            char right = s.charAt(i + k - 1);

            nmap.put(right,
                    nmap.getOrDefault(right, 0) + 1);

            if (kmap.equals(nmap)) {
                list.add(i);
            }
        }

        return list;
    }
}