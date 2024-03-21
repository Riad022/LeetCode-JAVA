import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> row = null ;
        Set <Character> col = null ;

        for(int i = 0 ; i<9 ; i++){
            row = new HashSet<>();
            col = new HashSet<>();
            for(int j=0 ; j<9 ; j++){
                char r = board[i][j];
                char c = board[j][i];

                if(r != '.'){
                    if(!row.add(r)) return false;
                }
                if(c != '.'){
                    if(!col.add(c)) return false ;
                }

            }
        }

        for(int i = 0 ; i<9 ; i = i+3){
            for(int j = 0 ; j<9 ; j= j+3){
                if(!checkBox(i , j , board)){
                    return false ;
                }
            }
        }
        return true ;
    }
    boolean checkBox(int col , int row , char[][] board){
        Set <Character> box = new HashSet<>();
        int colc = col + 3;
        int rowc = row +3 ;
        for(int i = col ; i< colc ; i++){
            for(int j = row ; j< rowc ;j++){
                if(board[i][j] != '.'){
                    if(!box.add(board[i][j])){
                        return false ;
                    }
                }
            }
        }
        return true ;
    }
}