package GameFigures;
import Game.Player;
import Game.Square;

public class Queen extends Piece {
    private PieceTypes type;
    private int x;
    private int y;
    private Player player;

    public Queen(int x, int y, Player player){
        super(x, y, player);
        this.type = PieceTypes.QUEEN;
    }

    @Override
    public PieceTypes getType() { return this.type; }

    @Override
    public boolean moveValidity(Square[][] board, int endX, int endY) {
        //How to indicate that only x types of moves are valid

        return false;
    }

}
