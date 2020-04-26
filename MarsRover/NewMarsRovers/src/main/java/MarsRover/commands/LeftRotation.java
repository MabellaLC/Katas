package MarsRover.commands;

import MarsRover.Command;
import MarsRover.Vector;

class LeftRotation implements Command {
    public Vector apply(Vector vector){
        return vector.rotateLeft();
    }
}
