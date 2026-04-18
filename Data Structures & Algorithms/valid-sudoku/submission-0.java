class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Column
        HashSet<Character> check = new HashSet<>();
        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 9; i++) {
                 if (check.contains(board[i][j]) && board[i][j] != '.') {
                    System.out.println("Column: " + j + "Row: " + i + "Value: " + board[i][j]);
                    return false; 
                 }
                check.add(board[i][j]);
            }
            check.clear();
        }

        check.clear();

        // Row
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (check.contains(board[i][j]) && board[i][j] != '.')
                {
                    System.out.println("Column: " + j + "Row: " + i + "Value: " + board[i][j]);
                    return false;
                }
                check.add(board[i][j]);
            }
            check.clear();
        }
        check.clear();

        // 3 x 3
        int row = 0;
        int column = 0;
  
        for (int rowIndex = 1; rowIndex <= 3; rowIndex++) {
            for (int colIndex = 1; colIndex <= 3; colIndex++) {
                if (rowIndex == 3) row = 6;
                else if (rowIndex == 2) row = 3;
                else if (rowIndex == 1) row = 0;;

                if (colIndex == 1) column = 0;
                if (colIndex == 2) column = 3;
                if (colIndex == 3) column = 6;

                for (int i = row; i < 3 * rowIndex; i++) {
                    for (int j = column; j < 3 * colIndex; j++) {
                         if (check.contains(board[i][j]) && board[i][j] != '.')
                         {
                            System.out.println("Column: " + j + " Row: " + i + " Value: " + board[i][j]);
                            return false;
                         }
                        check.add(board[i][j]);
                    }
                }
                check.clear();

            }
        }

        return true;
    }
}
