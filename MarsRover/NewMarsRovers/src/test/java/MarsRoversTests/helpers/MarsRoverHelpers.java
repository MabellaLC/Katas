package MarsRoversTests.helpers;

import MarsRover.MarsRover;

public class MarsRoverHelpers {
    public static MarsRover roverLocatedAt(int x, int y, String direction){

        return new MarsRover(x, y, direction);
    }
}
