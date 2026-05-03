class Solution {
    public int search(int[] nums, int target) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = (start + end) / 2;
            if (nums[mid] <= nums[end]) {
                end = mid;
            }
            else 
                start = mid + 1;
        }

        int start1 = start;
        end = nums.length - 1;

    
        while (start1 <= end) {
            int mid = (start1 + end) / 2;
            if (nums[mid] == target) {
                ans = mid;
                break;
            }
            
            else if (nums[mid] > target) {
                end = mid - 1;
            }
            else
                start1 = mid + 1;
        }


        int start2 = 0;
        end = start - 1;

        while (start2 <= end) {
            int mid = (start2 + end) / 2;
            if (nums[mid] == target) {
                ans = mid;
                break;
            }
            else if (nums[mid] > target) {
                end = mid - 1;
            }
            else
                start2 = mid + 1;
        }
        
        return ans;

    }
}
