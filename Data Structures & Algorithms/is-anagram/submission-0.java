class Solution {
    public boolean isAnagram(String s, String t) {

if(s.length() != t.length()){
    return false;
}
        Map<Character,Integer> charFreq = new HashMap<>();
        for(char i : s.toCharArray()){
            charFreq.put(i, charFreq.getOrDefault(i,0)+1);
        }

        for(char i : t.toCharArray()){
            charFreq.put(i, charFreq.getOrDefault(i,0)-1);
            if(charFreq.get(i) == 0){
                charFreq.remove(i);
            }
        }

        return charFreq.isEmpty();

    }
}
