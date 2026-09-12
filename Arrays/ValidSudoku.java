import java.util.HashSet;
import java.util.Set;
//36
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set <String> seen = new HashSet<>();

        for(int row=0; row<9; row++){
            for(int col=0; col<9; col++){
                if(board[row][col] == '.'){
                    continue;
                }
                // if(board[row][col] < '1' || board[row][col] > '9'){
                    // return false; }
            
                 int num = board[row][col];
                 String rowKey = num + " in row " + row;
                 String colKey= num + " in col " + col;

                 int box = (row / 3) * 3 + (col/3);
                 String boxKey = num + " in box " + box;

                 if(!seen.add(rowKey)){
                    return false;
                 }               
                 if(!seen.add(colKey)){
                    return false;
                 }     
                 if(!seen.add(boxKey)){
                    return false;
                 }
            }
        }
        return true;
    }
}
