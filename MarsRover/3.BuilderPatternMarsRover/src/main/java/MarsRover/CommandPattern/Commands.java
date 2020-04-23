package MarsRover.CommandPattern;
import MarsRover.MarsRoverReceiver;

public interface Commands {
    MarsRoverReceiver execute(MarsRoverReceiver marsRoverReceiver);
}
