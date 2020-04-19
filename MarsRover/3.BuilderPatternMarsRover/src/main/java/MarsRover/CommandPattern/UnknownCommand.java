package MarsRover.CommandPattern;

import MarsRover.MarsRoverReceiver;

public class UnknownCommand implements ICommands {

    @Override
    public MarsRoverReceiver execute(MarsRoverReceiver marsRoverReceiver){
        return marsRoverReceiver.unknownCommand();
    }
}
