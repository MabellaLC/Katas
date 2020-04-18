package MarsRover;

import java.util.Objects;

public class MarsRover {
    private int xcoordinate;
    private int ycoordinate;
    private char orientation;

    public MarsRover(int Xcoordinate, int Ycoordinate, char orientation) {

        this.xcoordinate = Xcoordinate;
        this.ycoordinate = Ycoordinate;
        this.orientation = orientation;
    }

    public MarsRover move(String command) {
        if (command.equals("f")) {
            if (orientation == 'N'){
                return new MarsRover(xcoordinate, ycoordinate + 1, orientation);
            }
            if(orientation == 'E') {
                return new MarsRover(xcoordinate + 1, ycoordinate, orientation);
            }
            if(orientation == 'S') {
                return new MarsRover(xcoordinate, ycoordinate - 1, orientation);
            }
            if(orientation == 'O'){
                    return new MarsRover(xcoordinate - 1, ycoordinate, orientation);
                }
        }
        if (command.equals("r")){
            if (orientation == 'N') {
                return new MarsRover(xcoordinate, ycoordinate, 'E');
            }
            if(orientation == 'E'){
                    return new MarsRover(xcoordinate, ycoordinate, 'S');
                }
            if(orientation == 'S'){
                return new MarsRover(xcoordinate, ycoordinate, 'O');
            }
            if(orientation == 'O') {
                return new MarsRover(xcoordinate, ycoordinate, 'N');
            }
        }

        if (command.equals("b")) {
            if (orientation == 'N') {
                return new MarsRover(xcoordinate, ycoordinate - 1, orientation);
            }
            if (orientation == 'E') {
                return new MarsRover(xcoordinate - 1, ycoordinate, orientation);
            }
            if (orientation == 'S') {
                return new MarsRover(xcoordinate, ycoordinate + 1, orientation);
            }
            if (orientation == 'O') {
                return new MarsRover(xcoordinate + 1, ycoordinate, orientation);
            }
        }

        if (command.equals("l")) {
            if (orientation == 'N') {
                return new MarsRover(xcoordinate, ycoordinate, 'O');
            }
            if (orientation == 'E') {
                return new MarsRover(xcoordinate, ycoordinate, 'N');
            }
            if (orientation == 'S') {
                return new MarsRover(xcoordinate, ycoordinate, 'E');
            }
            if (orientation == 'O') {
                return new MarsRover(xcoordinate, ycoordinate, 'S');
            }
        }

        return new MarsRover(xcoordinate, ycoordinate, orientation);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarsRover marsRover = (MarsRover) o;
        return xcoordinate == marsRover.xcoordinate &&
                ycoordinate == marsRover.ycoordinate &&
                orientation == marsRover.orientation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xcoordinate, ycoordinate, orientation);
    }
}
