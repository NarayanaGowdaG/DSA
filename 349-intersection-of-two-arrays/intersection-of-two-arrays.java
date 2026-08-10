class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Set<Integer> st=new HashSet<>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums2[j] < nums1[i]) {
                j++;
            } 
            else {
                st.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] ans = new int[st.size()];
    int k = 0;
for (int x : st) {
    ans[k] = x;
    k++;
}

        return ans;
        
    }
}