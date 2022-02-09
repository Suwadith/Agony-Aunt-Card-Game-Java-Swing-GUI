package model;

public class PenaltyBoard {

    private PenaltySquares[][] penaltySquares = new PenaltySquares[3][3];

    public PenaltyBoard() {
        this.penaltySquares = createBoard();
    }

    public PenaltySquares[][] getPenaltyBoard() {
        return penaltySquares;
    }

    public PenaltySquares[][] createBoard() {
        penaltySquares[0][0] = new PenaltySquares("JOKER");
        penaltySquares[0][1] = new PenaltySquares("SPADES");
        penaltySquares[0][2] = new PenaltySquares("OMEGA");
        penaltySquares[1][0] = new PenaltySquares("HEARTS");
        penaltySquares[1][1] = new PenaltySquares("QUEEN");
        penaltySquares[1][2] = new PenaltySquares("DIAMONDS");
        penaltySquares[2][0] = new PenaltySquares("PLUS");
        penaltySquares[2][1] = new PenaltySquares("CLUBS");
        penaltySquares[2][2] = new PenaltySquares("HASH");

        return penaltySquares;
    }


    public void setCounterOnBoard( Integer row, Integer column, char color) {
    	String penality = penaltySquares[row][column].getPenaltySquareName() + "(" + color +')';
    	penaltySquares[row][column].setPenaltySquareName(penality);
    }
    
    public void displayBoard() {
    	for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.format("%-10s", penaltySquares[i][j].getPenaltySquareName());
            }
            System.out.println();
        }
        System.out.println();
    }
}
