package sudokugame;

public class Sudoku {

    public static void main(String[] args) {
        int [][] board = new int[][]
                {
                    {8, 4, 9, 0, 0, 3, 5, 7, 0},
                    {0, 1, 0, 0, 0, 0, 0, 0, 0},
                    {7, 0, 0, 0, 9, 0, 0, 8, 3},
                    {0, 0, 0, 9, 4, 6, 7, 0, 0},
                    {0, 8, 0, 0, 5, 0, 0, 4, 0},
                    {0, 0, 6, 8, 7, 2, 0, 0, 0},
                    {5, 7, 0, 0, 1, 0, 0, 0, 4},
                    {0, 0, 0, 0, 0, 0, 0, 1, 0},
                    {0, 2, 1, 7, 0, 0, 8, 6, 5}
                };

        if(sudokugame(board, 9)){
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
        }

    }

    public static boolean sudokugame(int [][]board, int n){
        int row = -1;
        int column = -1;
        int i = 0;
        int j = 0;

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if(board[i][j] == 0){
                    row = i;
                    column = j;
                    break;
                }
            }
            if(row != -1){
                break;
            }

        }
        if(i == n){
            return  true;
        }
        else {
            for (int numbers = 1; numbers < 10; numbers++) {
                if(IsSafe(board, numbers, row, column, n)){
                    board[row][column] = numbers;
                    if(!sudokugame(board,n)){
                        board[row][column] = 0;
                    }
                    else {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static boolean IsSafe(int [][] board, int numbers, int row, int column, int n){
       
        for (int j = 0; j < 9; j++) {
            if(board[row][j] == numbers){
                return  false;
            }
        }
     
        for (int i = 0; i < 9; i++) {
            if(board[i][column] == numbers){
                return  false;
            }
        }
        int baserow = row - (row % 3);
        int basecolumn = column - (column % 3);
        for (int i = baserow; i < baserow + 3; i++) {
            for (int j = basecolumn; j < basecolumn + 3; j++) {
                if(board[i][j] == numbers){
                    return  false;
                }

            }
        }
        return true;
    }
}