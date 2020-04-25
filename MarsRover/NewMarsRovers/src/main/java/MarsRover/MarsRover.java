package MarsRover;

import java.util.Objects;

public class MarsRover {
    private Vector vector;

    public MarsRover(int x, int y, String directionCode) {
        this.vector = new Vector(new Coordinates(x, y), Direction.pointingTo(directionCode));
    }

    public void receive(String commandsCodes) {
        CommandsSequence commandsSequence = new CommandsSequence(commandsCodes);
        vector = commandsSequence.apply(vector);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarsRover marsRover = (MarsRover) o;
        return Objects.equals(vector, marsRover.vector);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vector);
    }

    @Override
    public String toString() {
        return "MarsRover{" +
                "vector=" + vector +
                '}';
    }
}
