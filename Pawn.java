package chessalmostfull;

public class Pawn extends Figure {
     String startPosition;

    public Pawn(String pawnName, boolean isWhite, String currentPosition) {
        super(pawnName, isWhite, currentPosition);
        this.startPosition = currentPosition;

    }

    @Override
    void Move(Chessboard b, String position) {
        int moveRow = 8 -(position.charAt(1) - '0');
        int moveColumn = position.charAt(0) - 'a';
        int currentRow = 8 -(this.getCurrentposition().charAt(1) - '0') ;
        int currentColumn = this.getCurrentposition().charAt(0) - 'a';
    
        if ( moveColumn < 0 || moveColumn >= b.table || moveRow < 0 || moveRow >= b.table ) {
            System.out.println("Input position is out of range!");
            return;
        } else if ((Math.abs(moveColumn - currentColumn) == 0)&&(Math.abs(moveRow - currentRow) == 2 )  //เดินสองช่อง
                && this.currentPosition.equals(startPosition) && b.board[moveRow][moveColumn] == null) {
            b.board[currentRow][currentColumn] = null;
            b.board[moveRow][moveColumn] = this;
            this.setCurrentPosition(position);
            System.out.println("Move " + this.name + " to " + position +" already.(2 blocks)");
            return;
        } else if ((Math.abs(moveColumn - currentColumn) == 0 && Math.abs(moveRow - currentRow) == 1) //เดินช่องเดียว
                && b.board[moveRow][moveColumn] == null) {
            b.board[currentRow][currentColumn] = null;
            b.board[moveRow][moveColumn] = this;
            this.setCurrentPosition(position);
            System.out.println("Move " + this.name + " to " + position +" already.(1 blocks)");
            return;
        } else if ((Math.abs(moveColumn - currentColumn) == 1 && Math.abs(moveRow - currentRow) == 1) //กินเฉียง
                && b.board[moveRow][moveColumn] != null && b.board[moveRow][moveColumn].isWhite() != this.isWhite) {
            b.board[currentRow][currentColumn] = null;
            b.board[moveRow][moveColumn] = this;
            this.setCurrentPosition(position);
            System.out.println("Move " + this.name + " to " + position +" already.(kill)");
            return;
        } 
    }
}
