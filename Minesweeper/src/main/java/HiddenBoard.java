import java.util.Random;

public class HiddenBoard extends Board{
    private Random rng = new Random();
    private double mineChance = 0.10;
    HiddenBoard(int width, int height) {
        super(width, height);
        int numberOfMines = (int) (width*height*mineChance);
        System.out.println(numberOfMines);
        int minesCounter = 0;
        while(minesCounter<numberOfMines){
            for(int i=0; i<height; i++){
                for(int j=0; j<width; j++){
                    if(rng.nextDouble()<=mineChance && minesCounter<numberOfMines){
                        board[i][j] = 1;
                        minesCounter+=1;
                    } else {
                        board[i][j] = 0;
                    }
                }
            }
        }
        System.out.println(minesCounter);

    }
}
