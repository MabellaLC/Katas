package MarsRover.BuilderPattern;


import MarsRover.MarsRoverApp;

public class MarsRoverBuilder {
    private int xcoordinate;
    private int ycoordinate;
    private String orientation;

    public static MarsRoverBuilder marsRoverBuilder(){
        return new MarsRoverBuilder();
    }

    public MarsRoverBuilder withCoordinates(int Xcoordinate, int Ycoordinate){
        xcoordinate = Xcoordinate;
        ycoordinate = Ycoordinate;
        return this;
    }

    public MarsRoverBuilder withOrientation(String orientation) {
        this.orientation = orientation;
        return this;
    }

    public MarsRoverApp build() {
        return new MarsRoverApp(xcoordinate, ycoordinate, orientation);
    }
}
