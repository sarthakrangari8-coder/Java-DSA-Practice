public class Sudoku {
    boolean isValidNum(char[][]board,int row,int col,int num){
        //check in row & col
        for (int i=0;i<9;i++){
            if (board[row][i]==num || board[i][col]==num) return false;
        }
        //check 3x3 sub board or grid
        int rowBox=(row/3)*3;
        int colBox=(col/3)*3;

        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                if (board[rowBox+i][colBox+j]==num) return false;
            }
        }
        return true;


    }
    boolean Solution(char[][]board){
        for (int row=0;row<9;row++){
            for (int col=0;col<9;col++){
                //find empty cell
                if (board[row][col]=='.'){
                    //star print number
                    for (char num='1';num<='9';num++){
                        //check valid number
                        if (isValidNum(board,row,col,num)){
                            board[row][col]=num;

                            //recursion to fill  remining empty cells
                            if (Solution(board))return true;
                            //undo num to '.'
                            board[row][col]='.';
                        }

                    }
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][]board){
        Solution(board);

    }
    public static void main(String[] args) {

        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        Sudoku obj =new Sudoku();
        obj.solveSudoku(board);

        //print solved board
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                System.out.print(board[i][j]+"");
            }
            System.out.println();
        }



    }

}





