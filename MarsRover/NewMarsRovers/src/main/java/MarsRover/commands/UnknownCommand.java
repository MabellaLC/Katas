package MarsRover.commands;

import MarsRover.Command;
import MarsRover.Vector;

class UnknownCommand implements Command {

    public Vector apply(Vector vector) {
        return vector;
    }
}
