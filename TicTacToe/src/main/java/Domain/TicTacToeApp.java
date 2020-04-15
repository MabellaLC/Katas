package Domain;

import Exceptions.*;

public class TicTacToeApp {

    private char lastToken = ' ';
    Board board = new Board();

    public void play(char token, int xCoordinate, int yCoordinate)  {

        if (lastToken == ' ' && token == 'O') {
            throw new PlayerNotValid("Invalid first player");
        }

        if (token == lastToken) {
            throw new PlayerNotValid("Invalid next player");
        }
        if (xCoordinate < 0 || yCoordinate < 0){
            throw new positionNegative("Position can't be negative");
        }
        if (xCoordinate > 2 || yCoordinate > 2){
            throw new OutOfBoard("Position doesn't exist");
        }


        Movement tile = new Movement(xCoordinate, yCoordinate, Board.SYMBOL_DEFAULT);
        if (!board.movementAt(tile).hasSameSymbol(tile)) {
            throw new PositionInBoardIsNotEmpty("Invalid position");
        }

        lastToken = token;
        board.updateTileAt(token, xCoordinate, yCoordinate);
    }

    public char winner() {
        return board.winner();
    }
}
