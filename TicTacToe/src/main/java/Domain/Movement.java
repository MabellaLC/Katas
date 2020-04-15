package Domain;

import java.util.Objects;

public class Movement {

    private int xCoordinate;
    private int yCoordinate;
    private char token;

    public Movement(int xCoordinate, int yCoordinate, char token) {

        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.token = token;
    }


    public char getToken() {
        return token;
    }

    public boolean hasSameSymbol(Movement token){
        return getToken() == token.getToken();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movement tile = (Movement) o;
        return xCoordinate == tile.xCoordinate &&
                yCoordinate == tile.yCoordinate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xCoordinate, yCoordinate);
    }
}
