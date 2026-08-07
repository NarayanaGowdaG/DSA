class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
         int len = n + m;
        int gap = (len / 2) + (len % 2);

        while (gap > 0) {
            int left = 0;
            int right = left + gap;
            while (right < len) {
                if (left < m && right >= m) {
                    swapIfGreater(nums1, nums2, left, right - m);
                }
                else if (left >= m) {
                    swapIfGreater(nums2, nums2, left - m, right - m);
                }
                else {
                    swapIfGreater(nums1, nums1, left, right);
                }
                left++;
                right++;
            }
            if (gap == 1)
                break;
            gap = (gap / 2) + (gap % 2);
        }

        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[i - m];
        }
    }
    private void swapIfGreater(int[] arr1, int[] arr2, int idx1, int idx2) {
        if (arr1[idx1] > arr2[idx2]) {
            
            int temp = arr1[idx1];
            arr1[idx1] = arr2[idx2];
            arr2[idx2] = temp;
        }
    }
        
    }
