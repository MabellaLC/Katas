package MarsRover.CommandPattern;

import MarsRover.MarsRoverReceiver;

public class Fordware implements ICommands {

    @Override
    public MarsRoverReceiver execute(MarsRoverReceiver marsRoverReceiver){
        return marsRoverReceiver.forward();
    }
}
