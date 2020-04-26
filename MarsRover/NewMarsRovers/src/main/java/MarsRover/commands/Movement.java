package MarsRover.commands;

import MarsRover.Command;
import MarsRover.Vector;

class Movement implements Command {
    private int displacement;

    public Movement(int displacement) {
        this.displacement = displacement;
    }

    public Vector apply (Vector vector){
        return vector.move(displacement);
    }
}
