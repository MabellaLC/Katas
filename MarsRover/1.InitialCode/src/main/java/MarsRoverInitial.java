import java.util.Objects;

public class MarsRoverInitial {
    private int xcoordinate;
    private int ycoordinate;
    private char orientation;

    public MarsRoverInitial(int Xcoordinate, int Ycoordinate, char orientation) {

        this.xcoordinate = Xcoordinate;
        this.ycoordinate = Ycoordinate;
        this.orientation = orientation;
    }

    public MarsRoverInitial move(String command) {
        if (command.equals("f")) {
            if (orientation == 'N'){
                return new MarsRoverInitial(xcoordinate, ycoordinate + 1, orientation);
            }
            if(orientation == 'E') {
                return new MarsRoverInitial(xcoordinate + 1, ycoordinate, orientation);
            }
            if(orientation == 'S') {
                return new MarsRoverInitial(xcoordinate, ycoordinate - 1, orientation);
            }
            if(orientation == 'O'){
                return new MarsRoverInitial(xcoordinate - 1, ycoordinate, orientation);
            }
        }
        if (command.equals("r")){
            if (orientation == 'N') {
                return new MarsRoverInitial(xcoordinate, ycoordinate, 'E');
            }
            if(orientation == 'E'){
                return new MarsRoverInitial(xcoordinate, ycoordinate, 'S');
            }
            if(orientation == 'S'){
                return new MarsRoverInitial(xcoordinate, ycoordinate, 'O');
            }
            if(orientation == 'O') {
                return new MarsRoverInitial(xcoordinate, ycoordinate, 'N');
            }
        }

        if (command.equals("b")) {
            if (orientation == 'N') {
                return new MarsRoverInitial(xcoordinate, ycoordinate - 1, orientation);
            }
            if (orientation == 'E') {
                return new MarsRoverInitial(xcoordinate - 1, ycoordinate, orientation);
            }
            if (orientation == 'S') {
                return new MarsRoverInitial(xcoordinate, ycoordinate + 1, orientation);
            }
            if (orientation == 'O') {
                return new MarsRoverInitial(xcoordinate + 1, ycoordinate, orientation);
            }
        }

        if (command.equals("l")) {
            if (orientation == 'N') {
                return new MarsRoverInitial(xcoordinate, ycoordinate, 'O');
            }
            if (orientation == 'E') {
                return new MarsRoverInitial(xcoordinate, ycoordinate, 'N');
            }
            if (orientation == 'S') {
                return new MarsRoverInitial(xcoordinate, ycoordinate, 'E');
            }
            if (orientation == 'O') {
                return new MarsRoverInitial(xcoordinate, ycoordinate, 'S');
            }
        }

        return new MarsRoverInitial(xcoordinate, ycoordinate, orientation);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarsRoverInitial that = (MarsRoverInitial) o;
        return xcoordinate == that.xcoordinate &&
                ycoordinate == that.ycoordinate &&
                orientation == that.orientation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xcoordinate, ycoordinate, orientation);
    }
}
