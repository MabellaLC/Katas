package MarsRoversTests;

import MarsRover.MarsRover;

public class MarsRoverBuilder {
    private int x;
    private int y;
    private String direction;

    public static MarsRoverBuilder aRover(){
        return new MarsRoverBuilder();
    }

    public MarsRoverBuilder at(int x, int y){
        this.x = x;
        this.y = y;
        return this;
    }

    public MarsRoverBuilder facing(String direction){
        this.direction = direction;
        return this;
    }

    public MarsRover build(){
        return new MarsRover(x, y, direction);
    }

}
