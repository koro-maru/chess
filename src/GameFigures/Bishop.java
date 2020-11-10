package GameFigures;

import Game.Player;
import Game.Square;

public class Bishop extends Piece {
    private Player player;
    private PieceTypes type;
    private int x;
    private int y;

    public Bishop(int x, int y, Player player){
        super(x, y, player);
        this.type = PieceTypes.BISHOP;
    }

    @Override
    public PieceTypes getType() {
        return type;
    }

    @Override
    public boolean moveValidity(Square[][] b, int endX, int endY) {
        return false;
    }
}
