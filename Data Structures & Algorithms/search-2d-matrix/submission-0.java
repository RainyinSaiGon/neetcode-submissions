class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean isExist = false;
        int left = 0;
        int right = matrix.length - 1;
        

        while (left <= right) {
            int index = (left + right) / 2;
            int start = 0;
            int end = matrix[0].length - 1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (matrix[index][mid] == target) {
                    isExist = true;
                    break;
                }
                else if (matrix[index][mid] > target) {
                    end = mid - 1;
                }
                else
                    start = mid + 1;
            }

            if (matrix[index][0]  > target) {
                right = index - 1;
            }
            else
                left = index + 1;
        }

    
        if (isExist == true)
            return true;
        else
            return false;

    }
}
