
package chessalmostfull;

import java.util.ArrayList;

public abstract class Figure {
    public String name;
    public boolean isWhite; 
    public String currentPosition;
    ArrayList<String> moveableList = new ArrayList<String>();

    public Figure(String playername, boolean isWhite, String currentPosition) {
        this.name = playername;
        this.isWhite = isWhite;
        this.currentPosition = currentPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return isWhite ? "White" : "Black";
    }
    
    public void setColor(boolean isWhite) {
        this.isWhite = isWhite;
    }
    
    public String getCurrentposition() {
        return currentPosition;
    }

    public void setCurrentPosition(String currentPosition) {
        this.currentPosition = currentPosition;
    }
    
    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean isWhite) {
        this.isWhite = isWhite;
    }

    abstract void Move(Chessboard board, String position);
}
