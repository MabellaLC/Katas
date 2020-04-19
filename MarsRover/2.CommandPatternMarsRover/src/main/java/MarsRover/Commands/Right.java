package MarsRover.Commands;

import MarsRover.MarsRoverReceiver;

public class Right implements ICommands {
    @Override
    public MarsRoverReceiver execute(MarsRoverReceiver marsRoverReceiver){
        return marsRoverReceiver.right();
    }
}
