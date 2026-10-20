class Solution {
public:
    int findLucky(vector<int>& arr) {
        map<int,int>mpp;
        int n=arr.size();
        for(int i=0;i<n;i++){
            mpp[arr[i]]++;
        }
        int ans=-1;
  for (auto it = mpp.begin(); it != mpp.end(); it++) {
            if (it->first == it->second) {
                ans = max(ans, it->first);
            }
        }

        return ans;
        
    }
};