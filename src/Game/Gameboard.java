package Game;
import GameFigures.*;

import java.util.ArrayList;

public class Gameboard {

    public static void main(String[] args){



        Square[][] board = new Square[8][8];
        ArrayList<Piece> whitePieces = new ArrayList<Piece>();
        ArrayList<Piece> whiteCapturedPieces = new ArrayList<Piece>();

        ArrayList<Piece> blackPieces = new ArrayList<Piece>();
        ArrayList<Piece> blackCapturedPieces = new ArrayList<Piece>();

        Player white = new Player(Colors.WHITE, whitePieces, whiteCapturedPieces);
        Player black = new Player(Colors.BLACK, blackPieces, blackCapturedPieces);

        setUpBoard(board, white,black, whitePieces, blackPieces);
        displayBoard(board);

        System.out.println(board[0][1].getPiece().moveValidity(board,2,2));
    }

    public static void setUpBoard(Square[][] board, Player white, Player black, ArrayList<Piece> whitePieces, ArrayList<Piece> blackPieces){
        //Is there a better way to setup board?
        Piece whiteRook = new Rook(0, 0, white);
        Piece whiteKnight = new Knight(0, 1, white);
        Piece whiteBishop = new Bishop(0, 2, white);
        Piece whiteQueen = new Queen(0, 3, white);
        Piece whiteKing = new King(0, 4, white);
        Piece whiteBishop2 = new Bishop(0, 5, white);
        Piece whiteKnight2 = new Knight(0, 6, white);
        Piece whiteRook2 = new Rook(0, 7, white);

        whitePieces.add(whiteRook);
        whitePieces.add(whiteKnight);
        whitePieces.add(whiteBishop);
        whitePieces.add(whiteQueen);
        whitePieces.add(whiteKing);
        whitePieces.add(whiteBishop2);
        whitePieces.add(whiteKnight2);
        whitePieces.add(whiteRook2);


        Piece blackRook = new Rook(7, 0, black);
        Piece blackKnight = new Knight(7, 1, black);
        Piece blackBishop = new Bishop(7, 2, black);
        Piece blackQueen = new Queen(7, 3, black);
        Piece blackKing = new King(7, 4, black);
        Piece blackBishop2 = new Bishop(7, 5, black);
        Piece blackKnight2 = new Knight(7, 6, black);
        Piece blackRook2 = new Rook(7, 7, black);

        blackPieces.add(blackRook);
        blackPieces.add(blackKnight);
        blackPieces.add(blackBishop);
        blackPieces.add(blackQueen);
        blackPieces.add(blackKing);
        blackPieces.add(blackBishop2);
        blackPieces.add(blackKnight2);
        blackPieces.add(blackRook2);

        board[0][0] = new Square(0, 0, Colors.WHITE, whiteRook);
        board[0][1] = new Square(0, 1, Colors.WHITE, whiteKnight);
        board[0][2] = new Square(0, 2, Colors.WHITE, whiteBishop);
        board[0][3] = new Square(0, 3, Colors.WHITE, whiteQueen);
        board[0][4] = new Square(0, 4, Colors.WHITE, whiteKing);
        board[0][5] = new Square(0, 5, Colors.WHITE, whiteBishop2);
        board[0][6] = new Square(0, 6, Colors.WHITE, whiteKnight2);
        board[0][7] = new Square(0, 7, Colors.WHITE, whiteRook2);

        board[7][0] = new Square(7,0, Colors.BLACK, blackRook);
        board[7][1] = new Square(7,1, Colors.BLACK, blackKnight);
        board[7][2] = new Square(7,2, Colors.BLACK, blackBishop);
        board[7][3] = new Square(7,3, Colors.BLACK, blackQueen);
        board[7][4] = new Square(7,4, Colors.BLACK, blackKing);
        board[7][5] = new Square(7,5, Colors.BLACK, blackBishop2);
        board[7][6] = new Square(7,6, Colors.BLACK, blackKnight2);
        board[7][7] = new Square(7,7, Colors.BLACK, blackRook2);

        for(int i = 0; i < 8; i++){
            Piece pawn = new Pawn(1, i, white);
            board[1][i] = new Square(1, i, Colors.WHITE, pawn);
            whitePieces.add(pawn);
        }

        for(int i = 0; i < 8; i++){
            Piece pawn = new Pawn(6, i, black);
            board[6][i] = new Square(6, i, Colors.BLACK, pawn);
            blackPieces.add(pawn);
        }
    }


    public static void displayBoard(Square[][] board){
        System.out.print("  ");
        for(int i =0; i < 8; i++){
            System.out.print(" " + i + " ");
        }
        System.out.println();
        for(int i = 0; i < 8; i++){
            System.out.print(" ——");
        }
        System.out.println();
        for(int i = 0; i < board.length; i++){
            Square[] row = board[i];
            System.out.print(i + "| ");
            for(Square square:  row){
                if(square!=null && square.getPiece()!=null) {
                    switch (square.checkType()) {
                        case PAWN:
                            System.out.print("P  ");
                            break;
                        case ROOK:
                            System.out.print("R  ");
                            break;
                        case QUEEN:
                            System.out.print("Q  ");
                            break;
                        case KING:
                            System.out.print("K  ");
                            break;
                        case KNIGHT:
                            System.out.print("Kn ");
                            break;
                        case BISHOP:
                            System.out.print("B  ");
                            break;
                    }
                }
                else{
                    System.out.print("X  ");
                }
            }
            System.out.println();
        }

    }
}
