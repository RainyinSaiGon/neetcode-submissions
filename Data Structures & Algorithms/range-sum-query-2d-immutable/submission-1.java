class NumMatrix {

    int[][] prefixSum;

    public NumMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        prefixSum = new int[n][m];
        for (int i = 0; i < n; i++) {
            prefixSum[i][0] = matrix[i][0];
            for (int j = 1; j < m; j++) {
                prefixSum[i][j] = prefixSum[i][j - 1] + matrix[i][j];
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                prefixSum[i][j] += prefixSum[i - 1][j];
            }
        }

    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int ans = 0;
        if (row1 != 0 && col1 != 0) {
            ans = prefixSum[row2][col2] - prefixSum[row2][col1 - 1] - prefixSum[row1-1][col2]
            + prefixSum[row1 - 1][col1 -1];
        }

        else if (row1 == 0 & col1 != 0) {
            ans = prefixSum[row2][col2] - prefixSum[row2][col1 - 1];
        }

        else if (row1 != 0 && col1 == 0) {
            ans = prefixSum[row2][col2] - prefixSum[row1 - 1][col2];
        }
        else if (row1 == 0 && col1 == 0) {
            ans = prefixSum[row2][col2];
        }
        
        return ans;
        
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */