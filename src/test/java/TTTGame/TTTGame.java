package TTTGame;

import java.util.Arrays;

public class TTTGame {


    private FieldStatus[][]board;

    public TTTGame(){
        board = new FieldStatus[3][3];
        for (int i = 0; i < 3; i++) {

            Arrays.fill(board[i],FieldStatus.EMPTY);
        }
    }



    public FieldStatus getFieldStatus(int row, int column){
        return board[row][column];

    }

    public void action( int column, int row) {
        board[row][column] = FieldStatus.X;
    }

    public void printBoard() {

    }
}
