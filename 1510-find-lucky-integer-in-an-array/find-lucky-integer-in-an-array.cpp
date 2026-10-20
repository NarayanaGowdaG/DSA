class Solution {
public:
    int findLucky(vector<int>& arr) {
        map<int,int>mpp;
        int n=arr.size();
        for(int i=0;i<n;i++){
            mpp[arr[i]]++;
        }
        int ans=-1;
                for (int i = 1; i <= 500; i++) {
            if (mpp[i] == i) {
                ans = i;
            }
        }
return ans;
        
    }
};