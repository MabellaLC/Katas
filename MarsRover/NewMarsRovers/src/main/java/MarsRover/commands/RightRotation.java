package MarsRover.commands;

import MarsRover.Command;
import MarsRover.Vector;

class RightRotation implements Command {
    public Vector apply (Vector vector){
        return vector.rotateRight();
    }
}
