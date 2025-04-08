//https://leetcode.com/problems/reverse-vowels-of-a-string/description/?envType=study-plan-v2&envId=leetcode-75
/*
Given a string s, reverse only all the vowels in the string and return it. 
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
Example 1:
Input: s = "IceCreAm"
Output: "AceCreIm"
Explanation:
The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
*/

public class revrseVowelsOfaString {
    public static void main(String[] args) {
        Solution sol=new Solution();
        String s="IceCreAm";
        System.out.println(sol.reverseVowels(s));
    }

    
}


class Solution {
    public String reverseVowels(String s) {
        char arr[]=s.toCharArray();
        int start=0;int end=arr.length-1;
        while(start<end){
            if(!isVowel(arr[start]))start++;
            if(!isVowel(arr[end]))end--;
            
           if(isVowel(arr[start]) && isVowel(arr[end])){ 
            reverse(arr,start,end);
            start++;
            end--;}
        }

        return String.valueOf(arr); 
    }
    static void reverse(char arr[],int i, int j){
        char temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    boolean isVowel(char ch){
        if(ch=='A'|| ch=='E'|| ch=='I'||ch=='O'||ch=='U'|| ch=='a'||ch=='e'||ch=='i'||    ch=='o'||ch=='u')return true;

        return false;
    }
}