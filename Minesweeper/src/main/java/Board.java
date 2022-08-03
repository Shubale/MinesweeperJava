import java.util.Random;

public class Board {
    protected int[][] board;
    Board(int width, int height){
        this.board = new int[height][width];
    }

    public void printBoard(){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
