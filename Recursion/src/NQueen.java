import java.util.ArrayList;
import java.util.List;
public class NQueen {
    //convert 2d array into String list
     static List<String> contructBoard(char[][]board){
        List<String> res=new ArrayList<>();
        for (char[] row:board){
            res.add(new String(row));
        }
        return res;
    }
    static boolean isValidCell(char[][]board,int row,int col ){
        int n= board.length;
        //check row - horizontally
        for (int i=0;i<n;i++ ){
            if (board[row][i]=='Q'){
                return false;
            }
        }
        //check col - vertically
        for (int i=0;i<n;i++ ){
            if (board[i][col]=='Q'){
                return false;
            }
        }
        //check left - upper diagonal
        for (int i=row-1, j=col-1; i>=0 && j>=0;i--,j--){
            if (board[i][j]=='Q'){
                return false;
            }
        }
        //check right - upper digonal
        for (int i=row-1,j=col+1;i>=0 && j<n ;i--,j++){
            if (board[i][j]=='Q'){
                return false;
            }
        }
        return true;


    }
    static void PlaceQueen(int row ,char[][]board,List<List<String>> res ){
        //base case
        if (row== board.length){
            res.add(contructBoard(board));
            return;
        }
        for (int col=0;col< board.length;col++){
            //verify the cell
            if (isValidCell(board,row,col)){
                //placeQueen
                board[row][col]='Q';
                //place remaining Queen
                PlaceQueen(row+1,board,res);
                //undo Q to '.'
                board[row][col]='.';

            }
        }

    }
    public static void main(String[] args) {
        List<List<String>> res =new ArrayList<>();
        int n=8;
        char[][] board=new char[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
               board[i][j]='.';
            }
        }
        PlaceQueen(0,board,res);
        System.out.println(res);

    }
}
