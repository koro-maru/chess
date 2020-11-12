package GameFigures;

import Game.Colors;
import Game.Player;
import Game.Square;

public class King extends Piece{
    private Player player;
    private PieceTypes type;

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
        //Must implement check (maybe see if there is a way for it to be captured)35
        if (Math.abs(x - endX) != 1 || Math.abs(y - endY) != 1) {
            return false;
        }
        return true;
    }



    private boolean canCastle(Square[][] b){
        boolean blackKingCanCastle = player.getColor()==Colors.BLACK && this==b[7][4].getPiece()
                                      && (b[7][0].checkType()==PieceTypes.ROOK || b[7][7].checkType()==PieceTypes.ROOK);
        boolean whiteKingCanCastle = player.getColor()==Colors.WHITE && this==b[0][4].getPiece()
                && (b[0][0].getPiece().getType()==PieceTypes.ROOK || b[0][7].getPiece().getType()==PieceTypes.ROOK);
        return player.getColor()==Colors.WHITE? whiteKingCanCastle : blackKingCanCastle;
    }

    private boolean castle(Square[][] b){
        return false;
    }
}
