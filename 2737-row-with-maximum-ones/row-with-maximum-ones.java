class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {        int n = mat.length;
        int m = mat[0].length;
        int cnt_max =0; 
        
        int index = 0;  
        for (int i = 0; i < n; i++) {
            int cnt_ones = 0; 
            for (int j = 0; j < m; j++) {
                cnt_ones += mat[i][j];
            }

            if (cnt_ones > cnt_max) {
                cnt_max = cnt_ones;
                index = i;
            }
        }
        return new int[] {index,cnt_max};

        
    }
}