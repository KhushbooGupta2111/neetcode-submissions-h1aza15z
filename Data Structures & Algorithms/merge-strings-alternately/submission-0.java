class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();

        StringBuilder res = new StringBuilder();
        for(int i = 0; i < n1 || i < n2; i++){
            if(i < n1){
                res.append(word1.charAt(i));
            }
            if(i < n2){
                res.append(word2.charAt(i));
            }
        }        
        

        return res.toString();
    }
}