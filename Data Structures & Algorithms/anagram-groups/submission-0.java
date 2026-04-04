class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> anagrams = new HashMap<>();

        for(String s : strs){
            char [] strArray = s.toCharArray();
            Arrays.sort(strArray);

            String key = new String(strArray);
            anagrams.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(anagrams.values());

    }
}