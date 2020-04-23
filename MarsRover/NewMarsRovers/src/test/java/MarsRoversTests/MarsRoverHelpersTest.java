package MarsRoversTests;

import MarsRover.MarsRover;

public class MarsRoverHelpersTest {
    public static MarsRover aRoverAt(int x, int y, String direction){
        return new MarsRover(x, y, direction);
    }
}
