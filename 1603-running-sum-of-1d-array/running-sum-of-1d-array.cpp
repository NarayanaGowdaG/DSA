class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        int n=nums.size();
        vector<int> ans;
        int an=0;
        for(int i=0;i<n;i++){
            an+=nums[i];
            ans.push_back(an);
        }
    return ans;    
    }
};