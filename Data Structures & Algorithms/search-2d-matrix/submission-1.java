class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;

        int rows = matrix.length;
        int cols = matrix[0].length;

        // 1. Find the potential row
        int top = 0, bot = rows - 1;
        int targetRow = -1;

        while (top <= bot) {
            int mid = top + (bot - top) / 2;
            // Check if target is within the bounds of this row
            if (matrix[mid][0] <= target && target <= matrix[mid][cols - 1]) {
                targetRow = mid;
                break; 
            } else if (matrix[mid][0] > target) {
                bot = mid - 1; // Target must be in a row above
            } else {
                top = mid + 1; // Target must be in a row below
            }
        }

        // If no valid row was found, the target isn't in the matrix
        if (targetRow == -1) return false;

        // 2. Binary search within the identified row
        int left = 0, right = cols - 1;
        while (left <= right) { // <-- TYPO FIXED HERE
            int mid = left + (right - left) / 2;
            
            if (matrix[targetRow][mid] == target) {
                return true;
            } else if (matrix[targetRow][mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}