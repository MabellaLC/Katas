package MarsRover.CommandPattern;

import MarsRover.MarsRoverReceiver;

public class Left implements ICommands {
    @Override
    public MarsRoverReceiver execute(MarsRoverReceiver marsRoverReceiver){
        return marsRoverReceiver.left();
    }
}
