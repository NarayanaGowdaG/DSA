class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer>mpp = new HashMap<>();
        int presum = 0, cnt = 0;
         mpp.put(0, 1);
        for (int i = 0; i < n; i++) {
            presum += nums[i];
            int sumToRemove = presum - k;
            cnt +=mpp.getOrDefault(sumToRemove, 0);
            mpp.put(presum, mpp.getOrDefault(presum, 0) + 1);
        }
        return cnt;
        
    }
}