class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mpp = new HashMap<>();
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int req = target - num;
            if (mpp.containsKey(req)) {
                return new int[]{i,mpp.get(req)};
            }
            mpp.put(nums[i], i);
        }
        return new int[]{};
        
    }
}