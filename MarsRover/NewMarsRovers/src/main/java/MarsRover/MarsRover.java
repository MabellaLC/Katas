package MarsRover;

import java.util.Objects;

public class MarsRover {
    private Coordinates coordinates;
    private Direction direction;

    public MarsRover(int x, int y, String directionCode) {
        this.coordinates = new Coordinates(x, y);
        this.direction = Direction.pointingTo(directionCode);
    }

    public void receive(String commandsSequence) {
        if (commandsSequence.equals("")) {
            return;
        }
        if (commandsSequence.equals("r")) {
            direction = direction.rotateRight();
        } else if (commandsSequence.equals("l")) {
            direction = direction.rotateLeft();
        } else {
            move(commandsSequence);
        }
    }

    private void move(String commandsSequence) {
        int displacement = getDisplacement(commandsSequence);
        coordinates = direction.move(coordinates, displacement);
    }

    private int getDisplacement(String commandsSequence) {
        int displacement = -1;
        if (commandsSequence.equals("f")) {
            displacement = 1;
        }
        return displacement;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MarsRover marsRover = (MarsRover) o;
        return Objects.equals(direction, marsRover.direction) &&
                Objects.equals(coordinates, marsRover.coordinates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(direction, coordinates);
    }

    @Override
    public String toString() {
        return "MarsRover.MarsRover{" +
                "direction='" + direction + '\'' +
                ", coordinates=" + coordinates +
                '}';
    }


}
