class Solution {
    public int countDigits(int num) {
        int n =  num ;
        int count = 0;
        while(n >0){
            int mod = n %10;
            n /= 10;
            if(num % mod == 0){
                count++;
            }
        }
        return count ; 
    }
}