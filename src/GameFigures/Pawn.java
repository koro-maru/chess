package GameFigures;

import Game.Colors;
import Game.Player;
import Game.Square;

public class Pawn extends Piece {
    private Player player;
    private PieceTypes type;
    private int startingRow;
    //Used for the exception where a pawn may move two spaces forward at the beginning of a game
    Colors color;
    public Pawn(int x, int y, Player player){
        super(x, y, player);
        this.startingRow = x;
        this.type = PieceTypes.PAWN;
    }

    @Override
    public PieceTypes getType() {
        return type;
    }

    @Override
    public boolean moveValidity(Square[][] b, int endX, int endY) {
        //pawn can move either one or two forward on its first turn
        //Capturing diagnolly and enpassant

        int maxMove = this.startingRow==x ? 2 : 1;
        if(Math.abs(x-endX) <= maxMove && Math.abs(x-endX) > 0){
            return true;
        }
        return false;
    }
}
