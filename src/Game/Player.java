package Game;

import GameFigures.Piece;

import java.util.ArrayList;

public class Player {
    private ArrayList<Piece> pieces = new ArrayList<Piece>();
    private ArrayList<Piece> capturedPieces = new ArrayList<>();
    private boolean isTurn;
    private boolean isWinner;
    public static boolean isGameOver = false;
    private Colors color;

    public Player(Colors color, ArrayList<Piece> pieces, ArrayList<Piece> capturedPieces){
        this.pieces = pieces;
        this.capturedPieces = capturedPieces;
        this.color = color;
        //Should I let this rely on another value in the constructor (will it be fully initiated)
        this.isTurn = color==Colors.WHITE ? true : false;
    }

    public boolean getIsTurn(){
        return this.isTurn;
    }

    public ArrayList<Piece> getPieces() {
        return this.pieces;
    }

    public ArrayList<Piece> getCapturedPieces() {
        return this.capturedPieces;
    }

    public Colors getColor(){
        return this.color;
    }
    //captured pieces for display purposes?
}
