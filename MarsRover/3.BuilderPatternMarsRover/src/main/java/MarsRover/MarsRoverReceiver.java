package MarsRover;

import java.util.Objects;

public class MarsRoverReceiver {

    private int xcoordinate;
    private int ycoordinate;
    private String  orientation;

    public MarsRoverReceiver(int xcoordinate, int ycoordinate, String orientation) {
        this.xcoordinate = xcoordinate;
        this.ycoordinate = ycoordinate;
        this.orientation = orientation;
    }

    public MarsRoverReceiver forward(){
        if (orientation.equals("N")){
            return new MarsRoverReceiver(xcoordinate, ycoordinate + 1, orientation);
        }
        if (orientation.equals("E")) {
             return new MarsRoverReceiver(xcoordinate + 1, ycoordinate, orientation);
        }
        if(orientation.equals("S")) {
             return new MarsRoverReceiver(xcoordinate, ycoordinate - 1, orientation);
        }
        if(orientation.equals("W")){
             return new MarsRoverReceiver(xcoordinate - 1, ycoordinate, orientation);
        }
        return new MarsRoverReceiver(xcoordinate,ycoordinate,orientation);
    }

    public MarsRoverReceiver right() {
        if (orientation.equals("N")){
            return new MarsRoverReceiver(xcoordinate, ycoordinate, orientation = "E");
        }
        if(orientation.equals("E")){
            return new MarsRoverReceiver(xcoordinate, ycoordinate, orientation = "S");
        }
        if(orientation.equals("S")){
            return new MarsRoverReceiver(xcoordinate, ycoordinate, orientation = "W");
        }
        if(orientation.equals("W")) {
            return new MarsRoverReceiver(xcoordinate, ycoordinate, orientation = "N");
        }
        return new MarsRoverReceiver(xcoordinate,ycoordinate,orientation);
    }

    public MarsRoverReceiver backward() {
        if (orientation.equals("N")){
            return new MarsRoverReceiver(xcoordinate, ycoordinate - 1, orientation);
        }
        if (orientation.equals("E")) {
            return new MarsRoverReceiver(xcoordinate - 1, ycoordinate, orientation);
        }
        if (orientation.equals("S")) {
            return new MarsRoverReceiver(xcoordinate, ycoordinate + 1, orientation);
        }
        if (orientation.equals("W") ){
            return new MarsRoverReceiver(xcoordinate + 1, ycoordinate, orientation);
        }
        return new MarsRoverReceiver(xcoordinate,ycoordinate,orientation);
    }

    public MarsRoverReceiver left() {
        if (orientation.equals("N")){
            return new MarsRoverReceiver(xcoordinate, ycoordinate, orientation = "W");
        }
        if (orientation.equals("E")) {
            new MarsRoverReceiver(xcoordinate, ycoordinate, orientation = "N");
        }
        if (orientation.equals("S")) {
            new MarsRoverReceiver(xcoordinate, ycoordinate, orientation = "E");
        }
        if (orientation.equals("W")) {
            new MarsRoverReceiver(xcoordinate, ycoordinate, orientation = "S");
        }
        return new MarsRoverReceiver(xcoordinate,ycoordinate,orientation);
    }

    public MarsRoverReceiver unknownCommand(){
        MarsRoverReceiver mars = new MarsRoverReceiver(xcoordinate,ycoordinate,orientation);
        return mars;
    }



    public MarsRoverApp updateMarsRover() {
        return new MarsRoverApp(xcoordinate,ycoordinate,orientation);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarsRoverReceiver that = (MarsRoverReceiver) o;

        return xcoordinate == that.xcoordinate &&
                ycoordinate == that.ycoordinate &&
                orientation == that.orientation;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xcoordinate, ycoordinate, orientation);
    }
}
