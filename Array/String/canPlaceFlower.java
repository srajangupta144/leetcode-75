//  https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75

/*You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, 
return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

Example 1:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: true */


public class canPlaceFlower{
    public static void main(String[] args) {
        int flowerbed[]={1,0,0,0,1};
        int n=1;
        if(canplace(flowerbed, n)){
            System.out.println("True");

        }else{
            System.out.println("False");
        }
    }
    public static boolean canplace(int[] flowerbed, int n) {
        int s=flowerbed.length;
        if(n>s)return false;
        int i=0;
        while(i<s){
            if(flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) &&
                (i == s - 1 || flowerbed[i + 1] == 0)) {                   
                    n--;
                    if(n==0)return true;
                    i+=2;
                }
                else i++; 
       }
       return n<=0;    
    }
}
