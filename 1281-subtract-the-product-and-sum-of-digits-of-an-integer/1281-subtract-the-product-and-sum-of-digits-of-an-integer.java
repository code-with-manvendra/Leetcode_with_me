class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int mul = 1 ; 
        while(n > 0 ){
            int mod = n % 10;
            n=  n/ 10;
            sum  += mod;
            mul *= mod;
        }
        return mul - sum;
    }
    
}