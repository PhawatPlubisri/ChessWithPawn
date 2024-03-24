package chessalmostfull;

public class Main {
    public static void main(String[] args) {
        Chessboard b = new Chessboard();
        b.setBoard();
        b.DisplayAllposittion(); 
        
        b.MoveFigure("WP1", "a3");
        b.MoveFigure("BP2", "b6");
        b.MoveFigure("WP1", "a4");
        b.MoveFigure("WP1", "a5");
        b.MoveFigure("WP1", "b6");
        b.MoveFigure("WP6", "f3");
        b.MoveFigure("WP6", "f4");
        b.MoveFigure("WP6", "f6");
        
        b.DisplayAllposittion();
    }
}
