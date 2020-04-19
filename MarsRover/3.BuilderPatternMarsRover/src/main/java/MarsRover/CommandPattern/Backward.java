package MarsRover.CommandPattern;

import MarsRover.MarsRoverReceiver;

public class Backward implements ICommands {
    @Override
    public MarsRoverReceiver execute(MarsRoverReceiver marsRover) {
        return marsRover.backward();
    }
}
