class Solution {
    public int missingNumber(int[] nums) {
         int n=nums.length;
        int XOR1=0;
        int XOR2=0;
        for(int i=0;i<=n-1;i++){
            XOR2=XOR2^nums[i];
            XOR1=XOR1^i;
        }
        XOR1=XOR1^n;
    

       return XOR1^XOR2;
        
    }
}