package MarsRover.CommandPattern;
import MarsRover.MarsRoverReceiver;

public interface ICommands {
    MarsRoverReceiver execute(MarsRoverReceiver marsRoverReceiver);
}