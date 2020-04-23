package MarsRover.CommandPattern;

import MarsRover.MarsRoverReceiver;

public class UnknownCommand implements Commands {

    @Override
    public MarsRoverReceiver execute(MarsRoverReceiver marsRoverReceiver){
        return marsRoverReceiver.unknownCommand();
    }
}
