package Game;
import GameFigures.Piece;
import GameFigures.PieceTypes;

public class Square {
    private int x;
    private int y;
    private Piece piece;
    private Colors color;


    //isInCheck
    //handle what happens w king
    //isInCheckmate checkmate


    public Square(int x, int y, Colors color, Piece p){
        this.piece = p;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public Piece getPiece() {
        return this.piece;
    }
    public Colors getColor(){
        return this.color;
    }

    public PieceTypes checkType(){
        return this.piece.getType();
    }

    public int getX(){return this.x;}

    public int getY(){return this.y;}

}
