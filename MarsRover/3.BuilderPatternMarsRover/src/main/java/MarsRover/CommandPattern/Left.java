package MarsRover.CommandPattern;

import MarsRover.MarsRoverReceiver;

public class Left implements Commands {
    @Override
    public MarsRoverReceiver execute(MarsRoverReceiver marsRoverReceiver){
        return marsRoverReceiver.left();
    }
}
