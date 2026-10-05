class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int s = 0;
        for (int i =0 ; i <nums.length; i++ ){
            s +=nums[i];
            int n  = nums[i];
            while(n > 0){
                sum += n %10;
                n /=10;
            }
        }
        return s - sum;
    }
}