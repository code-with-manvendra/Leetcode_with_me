class Solution {
    public int alternateDigitSum(int n) {
        String str = String.valueOf(n);
        int num =0;
        int [] arr = new int[str.length()];
        for(int i = 0 ; i<str.length();i++){
            arr[i] = str.charAt(i) - '0';
            if(i %2 ==0 ){
                num += arr[i];
            }else{
                num-=arr[i];
            }
        }
        return num;

    }
}