package MarsRover.CommandPattern;

import MarsRover.MarsRoverReceiver;

public class Right implements Commands {
    @Override
    public MarsRoverReceiver execute(MarsRoverReceiver marsRoverReceiver){
        return marsRoverReceiver.right();
    }
}
