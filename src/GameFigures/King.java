package GameFigures;

import Game.Player;
import Game.Square;

public class King extends Piece{
    private Player player;
    private PieceTypes type;
    private int x;
    private int y;

    public King(int x, int y, Player player){
        super(x, y, player);
        this.type = PieceTypes.KING;
    }

    @Override
    public PieceTypes getType() {
        return type;
    }

    @Override
    public boolean moveValidity(Square[][] b, int endX, int endY) {
        //Must implement castling
        //Must implement check (maybe see if there is a way for it to be captured)
        if (Math.abs(x - endX) != 1 || Math.abs(y - endY) != 1) {
            return false;
        }
        return true;
    }
}
