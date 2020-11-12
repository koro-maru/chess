package GameFigures;

import Game.Colors;
import Game.Player;
import Game.Square;

public class Rook extends Piece{
    private Player player;
    private PieceTypes type;

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
        if(endX==x){
            return checkHorizontal(b, x, y, endY);
        }
        return checkVertical(b, x,y, endX);
    }
}
