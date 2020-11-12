package GameFigures;

import Game.Colors;
import Game.Player;
import Game.Square;

public class Knight extends Piece {
    private Player player;
    private PieceTypes type;

    public Knight(int x, int y, Player player){
        super(x, y, player);
        this.type = PieceTypes.KNIGHT;
    }

    @Override
    public PieceTypes getType() {
        return type;
    }

    /*
    0    0 1 2 3 4 5 6 7
    1    0 1 X 3 4 5 6 7
    2    0 1 2 X 4 5 6 7
    3    0 X 2 3 4 5 6 7
    4    0 1 2 3 4 5 6 7
    5    0 1 2 3 4 5 6 7
    6    0 1 2 3 4 5 6 7
    7    0 1 2 3 4 5 6 7
  */

    @Override
    public boolean moveValidity(Square[][] b, int endX, int endY) {
            if(Math.abs(y-endY)==2 && Math.abs(x-endX)==1 ||
               Math.abs(y-endY)==1 && Math.abs(x-endX)==2){
                return true;
            }
        return false;
    }

}
