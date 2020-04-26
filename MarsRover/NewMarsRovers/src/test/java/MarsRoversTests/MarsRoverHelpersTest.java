package MarsRoversTests;

import MarsRover.MarsRover;

public class MarsRoverHelpersTest {
    public static MarsRover roverLocatedAt(int x, int y, String direction){

        return new MarsRover(x, y, direction);
    }
}
