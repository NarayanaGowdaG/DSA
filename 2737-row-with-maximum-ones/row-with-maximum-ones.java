class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
         int n = mat.length;
        int m = mat[0].length;
        int cnt_max = 0; 
        int index =0; 
        for (int i = 0; i < n; i++) {
            Arrays.sort(mat[i]);
            int cnt_ones = m - lowerBound(mat[i], m, 1);
            if (cnt_ones > cnt_max) {
                cnt_max = cnt_ones;
                index = i;
            }
        }

        return new int[]{index,cnt_max};
        
    }
    private int lowerBound(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        int ans = n;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}