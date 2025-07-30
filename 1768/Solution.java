class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        int min = Math.min(l1, l2);
        StringBuilder soln = new StringBuilder();
        for (int i = 0; i < Math.min(l1, l2); i++){
            soln.append(word1.charAt(i));
            soln.append(word2.charAt(i));
        }
        if (l1 > l2){
            soln.append(word1.substring(l2));
        } else {
            soln.append(word2.substring(l1));
        }
        return soln.toString();
    }
}