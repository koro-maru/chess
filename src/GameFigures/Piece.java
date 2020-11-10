package GameFigures;
import Game.*;


public abstract class Piece {
    int x;
    int y;
    Player p;

    public Piece(int x, int y, Player p){
        this.x = x;
        this.y = y;
        this.p = p;
    }

    public Player getPlayer(){
        return p;
    }
    public abstract PieceTypes getType();
    public abstract boolean moveValidity(Square[][] b, int endX, int endY);

    public void setX(){
        this.x = x;
    }

    public void setY(){
        this.y = y;
    }
    //maybe return object type
    //Should getClass() be used over an enum? Three pieces have behaviors that are special to them

    //If the square has the x and y position, why do the pieces need it too?

    boolean checkMinorDiagonal(Square[][] board, int startX, int startY, int endX, int endY, Player p){
        boolean after = startX > endX ? true : false;

        for(int i = endY, j = endX; i >= 0 && j < board.length; --i, ++j){
            //After to ensure the piece can still move the other way if there is another piece blocking one way
            if (board[i][j] != null && board[i][j].getColor().equals(p.getColor()) && ((after && j > startY)|| (!after && j < startY))) {
                return false;
            }

            if (endX == i && endY == j && endX != startX && endY != startY) {
                return true;
            }

        }

        return false;
    }

    //try using just the class' x and y instead of start params here?
    boolean checkMajorDiagonal(Square[][] board, int startX, int startY, int endX, int endY){
        int diagonalYBeginning = startY - startX;
        boolean after = startX < endX ? true : false;
        for(int i = 0, j = diagonalYBeginning; i < board.length && j < board.length; ++i, ++j){
            if (i > board.length || j > board.length) {
                return false;
            }

            //check if there is piece between end and start

            if (board[i][j] != null && board[i][j].getColor().equals(p.getColor()) && ((after && i > startX)||(!after && i < startX ))) {
                return false;
            }


            if (endX == i && endY == j && endX != startX && endY != startY) {
                return true;
            }


        }
        return false;
    }

    boolean checkHorizontal(Square[][] board, int startX, int startY, int endY){
        for(int i = 0; i < board.length; i++){
            boolean after = startY < endY ? true : false;
            //ability to still move a certain length if there is another piece horizontally
            if(endY==startY || board[startX][i]!=null && board[startX][i].getColor().equals(p.getColor()) &&  ((after && i > startY)||(!after && i < startY))){
                return false;
            }
        }
        return true;
    }

    boolean checkVertical(Square[][] board, int startX, int startY, int endX){
        for(int i = 0; i < board.length; i++){
            //desired square before or after current piece
            boolean after = startX < endX ? true : false;

            if(endX==startX || board[i][startY]!=null && board[i][startY].getColor().equals(p.getColor()) && (after && i > startX || (!after && i < startX))){
                return false;
            }
        }
        return true;
    }

}
