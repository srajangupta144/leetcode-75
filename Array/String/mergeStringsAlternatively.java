// https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75

//Example 1:

// Input: word1 = "abc", word2 = "pqr"
// Output: "apbqcr"
// Explanation: The merged string will be merged as so:
// word1:  a   b   c
// word2:    p   q   r
// merged: a p b q c r

class mergeStringsAlternatively{
    public String mergeAlternately(String word1, String word2) {
        StringBuilder s=new StringBuilder();
        int i=0;
        while(i<word1.length() && i<word2.length()){
            s.append(word1.charAt(i));
            s.append(word2.charAt(i));
            i++;
        }
        while(i<word1.length()){
            s.append(word1.charAt(i));
            i++;
        }
        while(i<word2.length()){
            s.append(word2.charAt(i));
            i++;
        }
        return s.toString();
    }
    public static void main(String[] args) {
        String a="abc";
        String b="pqr";
        mergeStringsAlternatively m=new mergeStringsAlternatively();
        System.out.println(m.mergeAlternately(a, b));
    }
}