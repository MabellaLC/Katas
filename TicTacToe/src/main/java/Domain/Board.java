package Domain;

import java.util.ArrayList;
import java.util.List;

public class Board {
    public static final char SYMBOL_DEFAULT = ' ';
    private List<Movement> movementList = new ArrayList<>();

    public Board(){
        for (int xCoordinate = 0; xCoordinate < 3; xCoordinate++){
            fillColumnWithEmptyTile(xCoordinate);
        }
    }

    private void fillColumnWithEmptyTile(int xCoordinate) {
        for (int yCoordinate = 0; yCoordinate < 3; yCoordinate++){
            Movement movement = new Movement(xCoordinate,yCoordinate,SYMBOL_DEFAULT);
            movementList.add(movement);
        }
    }

    private boolean checkRowIfSomeoneWIN(int rowIndex) {
        if (checkIfRowIsNotEmpty(rowIndex)) {
            return checkIfAllRowHasSameSymbol(rowIndex);
        }
        return false;
    }

    public char winner() {
        if (this.checkRowIfSomeoneWIN(0))
            return movementAt(new Movement(0, 0, SYMBOL_DEFAULT)).getToken();
        if (this.checkRowIfSomeoneWIN(1))
            return movementAt(new Movement(1, 0, SYMBOL_DEFAULT)).getToken();
        if (this.checkRowIfSomeoneWIN(2))
            return movementAt(new Movement(2, 0, SYMBOL_DEFAULT)).getToken();

        return SYMBOL_DEFAULT;
    }

    public Movement movementAt(Movement movement){
        if (movementList.contains(movement)) {
            return movementList.get(movementList.indexOf(movement));
        }
        return null;
    }

    public void updateTileAt(char token, int xCoordinate, int yCoordinate)
    {
        Movement movement = new Movement(xCoordinate, yCoordinate, token);
        movementList.set(movementList.indexOf(movement), movement);
    }

    private boolean checkIfAllRowHasSameSymbol(int rowIndex) {
        return movementAt(new Movement(rowIndex, 0, SYMBOL_DEFAULT)).
                hasSameSymbol(movementAt(new Movement(rowIndex, 1, SYMBOL_DEFAULT))) &&
                movementAt(new Movement(rowIndex, 2, SYMBOL_DEFAULT)).
                        hasSameSymbol(movementAt(new Movement(rowIndex, 1, SYMBOL_DEFAULT)));
    }

    private boolean checkIfRowIsNotEmpty(int rowIndex) {
        return !movementAt(new Movement(rowIndex, 0, SYMBOL_DEFAULT)).
                hasSameSymbol(new Movement(rowIndex, 1, SYMBOL_DEFAULT)) &&
                    !movementAt(new Movement(rowIndex, 2, SYMBOL_DEFAULT)).
                        hasSameSymbol(new Movement(rowIndex, 1, SYMBOL_DEFAULT));
    }
}
