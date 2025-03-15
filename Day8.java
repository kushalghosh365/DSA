//palindrome-number

class Solution {
    public boolean isPalindrome(int x) {
       int y = x;
       int revars = 0;
       int temp;
       while(y>0){
           temp = y%10;
           y = y/10;
           revars = revars*10+temp;
       } 
       if(x!=revars){
           return false;
       }
       
           return true;
       
    }
}
