package GameFigures;

import Game.Colors;
import Game.Player;
import Game.Square;

public class Rook extends Piece{
    private Player player;
    private PieceTypes type;
    private int x;
    private int y;

    public Rook(int x, int y, Player player){
        super(x, y, player);
        this.type = PieceTypes.ROOK;
    }


    @Override
    public PieceTypes getType() {
        return type;
    }

    @Override
    public boolean moveValidity(Square[][] b, int endX, int endY) {
        //Must implement castling
        return checkHorizontal(b, x,y, endY);
    }
}
