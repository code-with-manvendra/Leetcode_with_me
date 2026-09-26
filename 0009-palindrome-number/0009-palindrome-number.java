class Solution {
    public boolean isPalindrome(int x) {
        int rev  = 0 ; 
        int n = x;
        if(n < 0){
            return false;
        }
        if (n ==0){
            return true;
        }
         while (x !=0){
            int digit  =  x % 10;
            rev  =  (rev *10) + digit;
            x /=10;
        }
        return rev == n ; 
    }
}